package org.kakaoshare.backend.domain.brand.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBrand is a Querydsl query type for Brand
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBrand extends EntityPathBase<Brand> {

    private static final long serialVersionUID = -516228725L;

    public static final QBrand brand = new QBrand("brand");

    public final org.kakaoshare.backend.domain.base.entity.QBaseTimeEntity _super = new org.kakaoshare.backend.domain.base.entity.QBaseTimeEntity(this);

    public final NumberPath<Long> brandId = createNumber("brandId", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath iconPhoto = createString("iconPhoto");

    public final StringPath name = createString("name");

    public final ListPath<org.kakaoshare.backend.domain.product.entity.Product, org.kakaoshare.backend.domain.product.entity.QProduct> products = this.<org.kakaoshare.backend.domain.product.entity.Product, org.kakaoshare.backend.domain.product.entity.QProduct>createList("products", org.kakaoshare.backend.domain.product.entity.Product.class, org.kakaoshare.backend.domain.product.entity.QProduct.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QBrand(String variable) {
        super(Brand.class, forVariable(variable));
    }

    public QBrand(Path<? extends Brand> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBrand(PathMetadata metadata) {
        super(Brand.class, metadata);
    }

}

