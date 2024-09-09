package org.kakaoshare.backend.domain.product.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * org.kakaoshare.backend.domain.product.dto.QProductDto is a Querydsl Projection type for ProductDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QProductDto extends ConstructorExpression<ProductDto> {

    private static final long serialVersionUID = -36276794L;

    public QProductDto(com.querydsl.core.types.Expression<Long> productId, com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<String> photo, com.querydsl.core.types.Expression<Long> price, com.querydsl.core.types.Expression<String> brandName) {
        super(ProductDto.class, new Class<?>[]{long.class, String.class, String.class, long.class, String.class}, productId, name, photo, price, brandName);
    }

}

