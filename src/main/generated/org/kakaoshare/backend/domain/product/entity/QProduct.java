package org.kakaoshare.backend.domain.product.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProduct is a Querydsl query type for Product
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProduct extends EntityPathBase<Product> {

    private static final long serialVersionUID = -1587711605L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProduct product = new QProduct("product");

    public final org.kakaoshare.backend.domain.base.entity.QBaseTimeEntity _super = new org.kakaoshare.backend.domain.base.entity.QBaseTimeEntity(this);

    public final org.kakaoshare.backend.domain.brand.entity.QBrand brand;

    public final StringPath brandName = createString("brandName");

    public final ListPath<org.kakaoshare.backend.domain.cart.entity.Cart, org.kakaoshare.backend.domain.cart.entity.QCart> carts = this.<org.kakaoshare.backend.domain.cart.entity.Cart, org.kakaoshare.backend.domain.cart.entity.QCart>createList("carts", org.kakaoshare.backend.domain.cart.entity.Cart.class, org.kakaoshare.backend.domain.cart.entity.QCart.class, PathInits.DIRECT2);

    public final org.kakaoshare.backend.domain.category.entity.QCategory category;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath name = createString("name");

    public final NumberPath<Integer> orderCount = createNumber("orderCount", Integer.class);

    public final StringPath photo = createString("photo");

    public final NumberPath<Long> price = createNumber("price", Long.class);

    public final QProductDetail productDetail;

    public final NumberPath<Long> productId = createNumber("productId", Long.class);

    public final ListPath<ProductThumbnail, QProductThumbnail> productThumbnails = this.<ProductThumbnail, QProductThumbnail>createList("productThumbnails", ProductThumbnail.class, QProductThumbnail.class, PathInits.DIRECT2);

    public final StringPath type = createString("type");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final NumberPath<Integer> wishCount = createNumber("wishCount", Integer.class);

    public QProduct(String variable) {
        this(Product.class, forVariable(variable), INITS);
    }

    public QProduct(Path<? extends Product> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProduct(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProduct(PathMetadata metadata, PathInits inits) {
        this(Product.class, metadata, inits);
    }

    public QProduct(Class<? extends Product> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.brand = inits.isInitialized("brand") ? new org.kakaoshare.backend.domain.brand.entity.QBrand(forProperty("brand")) : null;
        this.category = inits.isInitialized("category") ? new org.kakaoshare.backend.domain.category.entity.QCategory(forProperty("category"), inits.get("category")) : null;
        this.productDetail = inits.isInitialized("productDetail") ? new QProductDetail(forProperty("productDetail")) : null;
    }

}

