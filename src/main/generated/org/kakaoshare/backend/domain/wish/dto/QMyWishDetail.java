package org.kakaoshare.backend.domain.wish.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * org.kakaoshare.backend.domain.wish.dto.QMyWishDetail is a Querydsl Projection type for MyWishDetail
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QMyWishDetail extends ConstructorExpression<MyWishDetail> {

    private static final long serialVersionUID = -177432846L;

    public QMyWishDetail(com.querydsl.core.types.Expression<Boolean> isPublic, com.querydsl.core.types.Expression<? extends WishDetail> wishDetail) {
        super(MyWishDetail.class, new Class<?>[]{boolean.class, WishDetail.class}, isPublic, wishDetail);
    }

}

