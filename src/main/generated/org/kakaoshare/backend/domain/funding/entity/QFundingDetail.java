package org.kakaoshare.backend.domain.funding.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFundingDetail is a Querydsl query type for FundingDetail
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFundingDetail extends EntityPathBase<FundingDetail> {

    private static final long serialVersionUID = 211981308L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFundingDetail fundingDetail = new QFundingDetail("fundingDetail");

    public final org.kakaoshare.backend.domain.base.entity.QBaseTimeEntity _super = new org.kakaoshare.backend.domain.base.entity.QBaseTimeEntity(this);

    public final NumberPath<Long> amount = createNumber("amount", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QFunding funding;

    public final NumberPath<Long> fundingDetailId = createNumber("fundingDetailId", Long.class);

    public final org.kakaoshare.backend.domain.member.entity.QMember member;

    public final org.kakaoshare.backend.domain.payment.entity.QPayment payment;

    public final NumberPath<Double> rate = createNumber("rate", Double.class);

    public final EnumPath<FundingDetailStatus> status = createEnum("status", FundingDetailStatus.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QFundingDetail(String variable) {
        this(FundingDetail.class, forVariable(variable), INITS);
    }

    public QFundingDetail(Path<? extends FundingDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFundingDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFundingDetail(PathMetadata metadata, PathInits inits) {
        this(FundingDetail.class, metadata, inits);
    }

    public QFundingDetail(Class<? extends FundingDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.funding = inits.isInitialized("funding") ? new QFunding(forProperty("funding"), inits.get("funding")) : null;
        this.member = inits.isInitialized("member") ? new org.kakaoshare.backend.domain.member.entity.QMember(forProperty("member")) : null;
        this.payment = inits.isInitialized("payment") ? new org.kakaoshare.backend.domain.payment.entity.QPayment(forProperty("payment")) : null;
    }

}

