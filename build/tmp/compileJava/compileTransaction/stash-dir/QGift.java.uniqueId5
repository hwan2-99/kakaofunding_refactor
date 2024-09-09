package org.kakaoshare.backend.domain.gift.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QGift is a Querydsl query type for Gift
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QGift extends EntityPathBase<Gift> {

    private static final long serialVersionUID = -1169454171L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QGift gift = new QGift("gift");

    public final org.kakaoshare.backend.domain.base.entity.QBaseTimeEntity _super = new org.kakaoshare.backend.domain.base.entity.QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final DateTimePath<java.time.LocalDateTime> expiredAt = createDateTime("expiredAt", java.time.LocalDateTime.class);

    public final NumberPath<Long> giftId = createNumber("giftId", Long.class);

    public final StringPath message = createString("message");

    public final StringPath messagePhoto = createString("messagePhoto");

    public final org.kakaoshare.backend.domain.receipt.entity.QReceipt receipt;

    public final EnumPath<GiftStatus> status = createEnum("status", GiftStatus.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QGift(String variable) {
        this(Gift.class, forVariable(variable), INITS);
    }

    public QGift(Path<? extends Gift> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QGift(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QGift(PathMetadata metadata, PathInits inits) {
        this(Gift.class, metadata, inits);
    }

    public QGift(Class<? extends Gift> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.receipt = inits.isInitialized("receipt") ? new org.kakaoshare.backend.domain.receipt.entity.QReceipt(forProperty("receipt"), inits.get("receipt")) : null;
    }

}

