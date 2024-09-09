package org.kakaoshare.backend.domain.wish.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * org.kakaoshare.backend.domain.wish.dto.QFriendWishDetail is a Querydsl Projection type for FriendWishDetail
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QFriendWishDetail extends ConstructorExpression<FriendWishDetail> {

    private static final long serialVersionUID = -106449308L;

    public QFriendWishDetail(com.querydsl.core.types.Expression<? extends WishDetail> wishDetail, com.querydsl.core.types.Expression<Boolean> isWished) {
        super(FriendWishDetail.class, new Class<?>[]{WishDetail.class, boolean.class}, wishDetail, isWished);
    }

}

