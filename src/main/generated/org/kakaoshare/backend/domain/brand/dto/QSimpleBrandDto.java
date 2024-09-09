package org.kakaoshare.backend.domain.brand.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * org.kakaoshare.backend.domain.brand.dto.QSimpleBrandDto is a Querydsl Projection type for SimpleBrandDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QSimpleBrandDto extends ConstructorExpression<SimpleBrandDto> {

    private static final long serialVersionUID = 627350888L;

    public QSimpleBrandDto(com.querydsl.core.types.Expression<Long> brandId, com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<String> iconPhoto) {
        super(SimpleBrandDto.class, new Class<?>[]{long.class, String.class, String.class}, brandId, name, iconPhoto);
    }

}

