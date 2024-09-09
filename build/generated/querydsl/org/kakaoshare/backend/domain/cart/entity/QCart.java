package org.kakaoshare.backend.domain.cart.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCart is a Querydsl query type for Cart
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCart extends EntityPathBase<Cart> {

    private static final long serialVersionUID = -74692731L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCart cart = new QCart("cart");

    public final org.kakaoshare.backend.domain.base.entity.QBaseTimeEntity _super = new org.kakaoshare.backend.domain.base.entity.QBaseTimeEntity(this);

    public final NumberPath<Long> cartId = createNumber("cartId", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final BooleanPath isSelected = createBoolean("isSelected");

    public final NumberPath<Integer> itemCount = createNumber("itemCount", Integer.class);

    public final org.kakaoshare.backend.domain.member.entity.QMember member;

    public final org.kakaoshare.backend.domain.option.entity.QOption option;

    public final org.kakaoshare.backend.domain.option.entity.QOptionDetail optionDetail;

    public final org.kakaoshare.backend.domain.product.entity.QProduct product;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCart(String variable) {
        this(Cart.class, forVariable(variable), INITS);
    }

    public QCart(Path<? extends Cart> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCart(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCart(PathMetadata metadata, PathInits inits) {
        this(Cart.class, metadata, inits);
    }

    public QCart(Class<? extends Cart> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new org.kakaoshare.backend.domain.member.entity.QMember(forProperty("member")) : null;
        this.option = inits.isInitialized("option") ? new org.kakaoshare.backend.domain.option.entity.QOption(forProperty("option"), inits.get("option")) : null;
        this.optionDetail = inits.isInitialized("optionDetail") ? new org.kakaoshare.backend.domain.option.entity.QOptionDetail(forProperty("optionDetail"), inits.get("optionDetail")) : null;
        this.product = inits.isInitialized("product") ? new org.kakaoshare.backend.domain.product.entity.QProduct(forProperty("product"), inits.get("product")) : null;
    }

}

