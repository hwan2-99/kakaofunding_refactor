package org.kakaoshare.backend.logging.filter;

import com.querydsl.core.util.StringUtils;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.kakaoshare.backend.logging.util.ApiQueryCounter;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.springframework.http.HttpHeaders.AUTHORIZATION;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Component
@Slf4j
@RequiredArgsConstructor
public class LoggingFilter extends OncePerRequestFilter {
    private static final String REQUEST_LOG_NO_BODY_FORMAT = "REQUEST :: METHOD: {}, URL: {}, HAS_AUTHORIZATION: {}";
    private static final String REQUEST_LOG_FORMAT = REQUEST_LOG_NO_BODY_FORMAT + ", BODY: {}";
    private static final String RESPONSE_LOG_NO_BODY_FORMAT = "RESPONSE :: STATUS_CODE: {}, METHOD: {}, URL: {}, QUERY_COUNT: {}, TIME_TAKEN: {}ms";
    private static final String QUERY_COUNT_WARNING_LOG_FORMAT = "쿼리가 {}번 이상 실행되었습니다.";

    private static final int QUERY_COUNT_WARNING_STANDARD = 10;
    private static final String START_OF_PARAMS = "?";
    private static final String PARAM_DELIMITER = "&";
    private static final String KEY_VALUE_DELIMITER = "=";

    private static final String METRIC_URL_PREFIX = "/actuator";
    private static final String FAVICON_URL = "/favicon.ico";

    private final StopWatch apiTimer;
    private final ApiQueryCounter apiQueryCounter;

    @Override
    protected void doFilterInternal(final HttpServletRequest request,
                                    final HttpServletResponse response,
                                    final FilterChain filterChain) throws ServletException, IOException {
        final ContentCachingRequestWrapper cachingRequest = new ContentCachingRequestWrapper(request);
        final ContentCachingResponseWrapper cachingResponse = new ContentCachingResponseWrapper(response);
        final String requestURI = cachingRequest.getRequestURI();
        if (requestURI.contains(METRIC_URL_PREFIX) || requestURI.contains(FAVICON_URL)) {
            return;
        }

        apiTimer.start();
        filterChain.doFilter(cachingRequest, cachingResponse);
        apiTimer.stop();

        logRequestAndResponse(cachingRequest, cachingResponse);
        cachingResponse.copyBodyToResponse();
    }

    private void logRequestAndResponse(final ContentCachingRequestWrapper request,
                                       final ContentCachingResponseWrapper response) {
        logRequest(request);
        logResponse(request, response);
        warnByQueryCount();
    }

    private void logRequest(final ContentCachingRequestWrapper request) {
        final String requestBody = new String(request.getContentAsByteArray());
        final String requestURIWithParams = getRequestURIWithParams(request);

        if (requestBody.isBlank()) {
            log.info(REQUEST_LOG_NO_BODY_FORMAT, request.getMethod(), requestURIWithParams, StringUtils.isNullOrEmpty(request.getHeader(AUTHORIZATION)));
            return;
        }

        log.info(REQUEST_LOG_FORMAT, request.getMethod(), requestURIWithParams, StringUtils.isNullOrEmpty(request.getHeader(AUTHORIZATION)), requestBody);
    }

    private void logResponse(final ContentCachingRequestWrapper request,
                             final ContentCachingResponseWrapper response) {
        final int queryCount = apiQueryCounter.getCount();
        final String requestURIWithParams = getRequestURIWithParams(request);
        log.info(RESPONSE_LOG_NO_BODY_FORMAT, response.getStatus(), request.getMethod(),
                requestURIWithParams, queryCount, apiTimer.getLastTaskTimeMillis());
    }

    private String getRequestURIWithParams(final ContentCachingRequestWrapper request) {
        final String requestURI = request.getRequestURI();
        final Map<String, String[]> params = request.getParameterMap();

        if (params.isEmpty()) {
            return requestURI;
        }

        final String parsedParams = parseParams(params);
        return requestURI + parsedParams;
    }

    private String parseParams(final Map<String , String[]> params) {
        final String everyParamStrings = params.entrySet().stream()
                .map(this::toParamString)
                .collect(Collectors.joining(PARAM_DELIMITER));

        return START_OF_PARAMS + everyParamStrings;
    }

    private String toParamString(final Map.Entry<String, String[]> entry) {
        final String key = entry.getKey();
        final StringBuilder builder = new StringBuilder();

        return Arrays.stream(entry.getValue())
                .map(value -> builder.append(key).append(KEY_VALUE_DELIMITER).append(value))
                .collect(Collectors.joining(PARAM_DELIMITER));
    }

    private Optional<String> getJsonResponseBody(final ContentCachingResponseWrapper response) {
        if (Objects.equals(response.getContentType(), APPLICATION_JSON_VALUE)) {
            return Optional.of(new String(response.getContentAsByteArray()));
        }

        return Optional.empty();
    }

    private void warnByQueryCount() {
        final int queryCount = apiQueryCounter.getCount();
        if (queryCount >= QUERY_COUNT_WARNING_STANDARD) {
            log.warn(QUERY_COUNT_WARNING_LOG_FORMAT, QUERY_COUNT_WARNING_STANDARD);
        }
    }
}
