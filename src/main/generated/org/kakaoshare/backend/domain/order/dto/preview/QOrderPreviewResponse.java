package org.kakaoshare.backend.domain.order.dto.preview;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * org.kakaoshare.backend.domain.order.dto.preview.QOrderPreviewResponse is a Querydsl Projection type for OrderPreviewResponse
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QOrderPreviewResponse extends ConstructorExpression<OrderPreviewResponse> {

    private static final long serialVersionUID = 429855416L;

    public QOrderPreviewResponse(com.querydsl.core.types.Expression<? extends org.kakaoshare.backend.domain.product.dto.ProductDto> product, com.querydsl.core.types.Expression<? extends java.util.List<String>> optionNames, com.querydsl.core.types.Expression<Integer> quantity) {
        super(OrderPreviewResponse.class, new Class<?>[]{org.kakaoshare.backend.domain.product.dto.ProductDto.class, java.util.List.class, int.class}, product, optionNames, quantity);
    }

}

