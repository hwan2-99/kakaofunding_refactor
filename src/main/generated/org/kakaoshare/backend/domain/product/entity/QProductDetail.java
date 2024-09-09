package org.kakaoshare.backend.domain.product.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QProductDetail is a Querydsl query type for ProductDetail
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProductDetail extends EntityPathBase<ProductDetail> {

    private static final long serialVersionUID = 982901180L;

    public static final QProductDetail productDetail = new QProductDetail("productDetail");

    public final org.kakaoshare.backend.domain.base.entity.QBaseTimeEntity _super = new org.kakaoshare.backend.domain.base.entity.QBaseTimeEntity(this);

    public final StringPath billingNotice = createString("billingNotice");

    public final StringPath caution = createString("caution");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath deliverDescription = createString("deliverDescription");

    public final StringPath description = createString("description");

    public final BooleanPath hasPhoto = createBoolean("hasPhoto");

    public final StringPath manufacturer = createString("manufacturer");

    public final StringPath origin = createString("origin");

    public final NumberPath<Long> productDetailId = createNumber("productDetailId", Long.class);

    public final StringPath productName = createString("productName");

    public final StringPath tel = createString("tel");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QProductDetail(String variable) {
        super(ProductDetail.class, forVariable(variable));
    }

    public QProductDetail(Path<? extends ProductDetail> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProductDetail(PathMetadata metadata) {
        super(ProductDetail.class, metadata);
    }

}

