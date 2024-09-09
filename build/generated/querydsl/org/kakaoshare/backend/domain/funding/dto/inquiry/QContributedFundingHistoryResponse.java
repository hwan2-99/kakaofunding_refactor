package org.kakaoshare.backend.domain.funding.dto.inquiry;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * org.kakaoshare.backend.domain.funding.dto.inquiry.QContributedFundingHistoryResponse is a Querydsl Projection type for ContributedFundingHistoryResponse
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QContributedFundingHistoryResponse extends ConstructorExpression<ContributedFundingHistoryResponse> {

    private static final long serialVersionUID = 1394163136L;

    public QContributedFundingHistoryResponse(com.querydsl.core.types.Expression<? extends org.kakaoshare.backend.domain.product.dto.ProductDto> product, com.querydsl.core.types.Expression<ContributedFundingHistoryDto> fundingDetail) {
        super(ContributedFundingHistoryResponse.class, new Class<?>[]{org.kakaoshare.backend.domain.product.dto.ProductDto.class, ContributedFundingHistoryDto.class}, product, fundingDetail);
    }

}

