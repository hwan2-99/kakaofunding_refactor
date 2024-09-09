package org.kakaoshare.backend.domain.option.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOptionDetail is a Querydsl query type for OptionDetail
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOptionDetail extends EntityPathBase<OptionDetail> {

    private static final long serialVersionUID = -704762016L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOptionDetail optionDetail = new QOptionDetail("optionDetail");

    public final org.kakaoshare.backend.domain.base.entity.QBaseTimeEntity _super = new org.kakaoshare.backend.domain.base.entity.QBaseTimeEntity(this);

    public final NumberPath<Long> additionalPrice = createNumber("additionalPrice", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath name = createString("name");

    public final QOption option;

    public final NumberPath<Long> optionDetailId = createNumber("optionDetailId", Long.class);

    public final StringPath photo = createString("photo");

    public final NumberPath<Integer> quantity = createNumber("quantity", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QOptionDetail(String variable) {
        this(OptionDetail.class, forVariable(variable), INITS);
    }

    public QOptionDetail(Path<? extends OptionDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOptionDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOptionDetail(PathMetadata metadata, PathInits inits) {
        this(OptionDetail.class, metadata, inits);
    }

    public QOptionDetail(Class<? extends OptionDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.option = inits.isInitialized("option") ? new QOption(forProperty("option"), inits.get("option")) : null;
    }

}

