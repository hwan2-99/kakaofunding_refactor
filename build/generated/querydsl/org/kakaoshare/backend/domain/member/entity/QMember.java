package org.kakaoshare.backend.domain.member.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = 660908473L;

    public static final QMember member = new QMember("member1");

    public final org.kakaoshare.backend.domain.base.entity.QBaseTimeEntity _super = new org.kakaoshare.backend.domain.base.entity.QBaseTimeEntity(this);

    public final ListPath<org.kakaoshare.backend.domain.cart.entity.Cart, org.kakaoshare.backend.domain.cart.entity.QCart> carts = this.<org.kakaoshare.backend.domain.cart.entity.Cart, org.kakaoshare.backend.domain.cart.entity.QCart>createList("carts", org.kakaoshare.backend.domain.cart.entity.Cart.class, org.kakaoshare.backend.domain.cart.entity.QCart.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final EnumPath<Gender> gender = createEnum("gender", Gender.class);

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final StringPath name = createString("name");

    public final StringPath phoneNumber = createString("phoneNumber");

    public final StringPath profileImageUrl = createString("profileImageUrl");

    public final StringPath providerId = createString("providerId");

    public final EnumPath<Role> role = createEnum("role", Role.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final ListPath<org.kakaoshare.backend.domain.wish.entity.Wish, org.kakaoshare.backend.domain.wish.entity.QWish> wishes = this.<org.kakaoshare.backend.domain.wish.entity.Wish, org.kakaoshare.backend.domain.wish.entity.QWish>createList("wishes", org.kakaoshare.backend.domain.wish.entity.Wish.class, org.kakaoshare.backend.domain.wish.entity.QWish.class, PathInits.DIRECT2);

    public QMember(String variable) {
        super(Member.class, forVariable(variable));
    }

    public QMember(Path<? extends Member> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember(PathMetadata metadata) {
        super(Member.class, metadata);
    }

}

