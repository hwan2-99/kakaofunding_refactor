package org.kakaoshare.backend.domain.product.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProductDescriptionPhoto is a Querydsl query type for ProductDescriptionPhoto
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProductDescriptionPhoto extends EntityPathBase<ProductDescriptionPhoto> {

    private static final long serialVersionUID = -105044159L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProductDescriptionPhoto productDescriptionPhoto = new QProductDescriptionPhoto("productDescriptionPhoto");

    public final org.kakaoshare.backend.domain.base.entity.QBaseTimeEntity _super = new org.kakaoshare.backend.domain.base.entity.QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> photoId = createNumber("photoId", Long.class);

    public final StringPath photoUrl = createString("photoUrl");

    public final QProduct product;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QProductDescriptionPhoto(String variable) {
        this(ProductDescriptionPhoto.class, forVariable(variable), INITS);
    }

    public QProductDescriptionPhoto(Path<? extends ProductDescriptionPhoto> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProductDescriptionPhoto(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProductDescriptionPhoto(PathMetadata metadata, PathInits inits) {
        this(ProductDescriptionPhoto.class, metadata, inits);
    }

    public QProductDescriptionPhoto(Class<? extends ProductDescriptionPhoto> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.product = inits.isInitialized("product") ? new QProduct(forProperty("product"), inits.get("product")) : null;
    }

}

