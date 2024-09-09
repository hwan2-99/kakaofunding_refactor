package org.kakaoshare.backend.domain.product.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * org.kakaoshare.backend.domain.product.dto.QProduct4DisplayDto is a Querydsl Projection type for Product4DisplayDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QProduct4DisplayDto extends ConstructorExpression<Product4DisplayDto> {

    private static final long serialVersionUID = -1299201512L;

    public QProduct4DisplayDto(com.querydsl.core.types.Expression<Long> productId, com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<String> photo, com.querydsl.core.types.Expression<Long> price, com.querydsl.core.types.Expression<String> brandName, com.querydsl.core.types.Expression<Long> wishCount, com.querydsl.core.types.Expression<Boolean> isWished) {
        super(Product4DisplayDto.class, new Class<?>[]{long.class, String.class, String.class, long.class, String.class, long.class, boolean.class}, productId, name, photo, price, brandName, wishCount, isWished);
    }

}

