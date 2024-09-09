package org.kakaoshare.backend.domain.wish.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * org.kakaoshare.backend.domain.wish.dto.QWishDetail is a Querydsl Projection type for WishDetail
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QWishDetail extends ConstructorExpression<WishDetail> {

    private static final long serialVersionUID = -1654878298L;

    public QWishDetail(com.querydsl.core.types.Expression<Long> wishId, com.querydsl.core.types.Expression<Long> productId, com.querydsl.core.types.Expression<String> productName, com.querydsl.core.types.Expression<Long> productPrice, com.querydsl.core.types.Expression<String> productPhoto, com.querydsl.core.types.Expression<String> brandName, com.querydsl.core.types.Expression<Integer> wishCount) {
        super(WishDetail.class, new Class<?>[]{long.class, long.class, String.class, long.class, String.class, String.class, int.class}, wishId, productId, productName, productPrice, productPhoto, brandName, wishCount);
    }

}

