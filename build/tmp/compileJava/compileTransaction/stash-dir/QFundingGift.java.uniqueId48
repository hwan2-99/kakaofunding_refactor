package org.kakaoshare.backend.domain.gift.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFundingGift is a Querydsl query type for FundingGift
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFundingGift extends EntityPathBase<FundingGift> {

    private static final long serialVersionUID = -647890504L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFundingGift fundingGift = new QFundingGift("fundingGift");

    public final org.kakaoshare.backend.domain.base.entity.QBaseTimeEntity _super = new org.kakaoshare.backend.domain.base.entity.QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final DateTimePath<java.time.LocalDateTime> expiredAt = createDateTime("expiredAt", java.time.LocalDateTime.class);

    public final org.kakaoshare.backend.domain.funding.entity.QFunding funding;

    public final NumberPath<Long> fundingGiftId = createNumber("fundingGiftId", Long.class);

    public final EnumPath<GiftStatus> status = createEnum("status", GiftStatus.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QFundingGift(String variable) {
        this(FundingGift.class, forVariable(variable), INITS);
    }

    public QFundingGift(Path<? extends FundingGift> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFundingGift(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFundingGift(PathMetadata metadata, PathInits inits) {
        this(FundingGift.class, metadata, inits);
    }

    public QFundingGift(Class<? extends FundingGift> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.funding = inits.isInitialized("funding") ? new org.kakaoshare.backend.domain.funding.entity.QFunding(forProperty("funding"), inits.get("funding")) : null;
    }

}

