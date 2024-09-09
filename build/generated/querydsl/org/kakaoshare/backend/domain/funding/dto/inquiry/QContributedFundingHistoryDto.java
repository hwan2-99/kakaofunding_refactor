package org.kakaoshare.backend.domain.funding.dto.inquiry;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * org.kakaoshare.backend.domain.funding.dto.inquiry.QContributedFundingHistoryDto is a Querydsl Projection type for ContributedFundingHistoryDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QContributedFundingHistoryDto extends ConstructorExpression<ContributedFundingHistoryDto> {

    private static final long serialVersionUID = 331163904L;

    public QContributedFundingHistoryDto(com.querydsl.core.types.Expression<? extends org.kakaoshare.backend.domain.product.dto.ProductDto> productDto, com.querydsl.core.types.Expression<Long> fundingId, com.querydsl.core.types.Expression<Long> fundingDetailId, com.querydsl.core.types.Expression<Long> contributedAmount, com.querydsl.core.types.Expression<java.time.LocalDateTime> contributedAt, com.querydsl.core.types.Expression<String> providerId, com.querydsl.core.types.Expression<String> creatorName, com.querydsl.core.types.Expression<String> status) {
        super(ContributedFundingHistoryDto.class, new Class<?>[]{org.kakaoshare.backend.domain.product.dto.ProductDto.class, long.class, long.class, long.class, java.time.LocalDateTime.class, String.class, String.class, String.class}, productDto, fundingId, fundingDetailId, contributedAmount, contributedAt, providerId, creatorName, status);
    }

}

