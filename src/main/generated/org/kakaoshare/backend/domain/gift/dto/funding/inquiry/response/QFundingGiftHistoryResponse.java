package org.kakaoshare.backend.domain.gift.dto.funding.inquiry.response;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * org.kakaoshare.backend.domain.gift.dto.funding.inquiry.response.QFundingGiftHistoryResponse is a Querydsl Projection type for FundingGiftHistoryResponse
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QFundingGiftHistoryResponse extends ConstructorExpression<FundingGiftHistoryResponse> {

    private static final long serialVersionUID = -385382184L;

    public QFundingGiftHistoryResponse(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<? extends org.kakaoshare.backend.domain.product.dto.ProductDto> product, com.querydsl.core.types.Expression<Integer> quantity, com.querydsl.core.types.Expression<java.time.LocalDateTime> receivedDate) {
        super(FundingGiftHistoryResponse.class, new Class<?>[]{long.class, org.kakaoshare.backend.domain.product.dto.ProductDto.class, int.class, java.time.LocalDateTime.class}, id, product, quantity, receivedDate);
    }

}

