package org.kakaoshare.backend.domain.receipt.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReceipt is a Querydsl query type for Receipt
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReceipt extends EntityPathBase<Receipt> {

    private static final long serialVersionUID = 829888107L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReceipt receipt = new QReceipt("receipt");

    public final org.kakaoshare.backend.domain.base.entity.QBaseTimeEntity _super = new org.kakaoshare.backend.domain.base.entity.QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final ListPath<ReceiptOption, QReceiptOption> options = this.<ReceiptOption, QReceiptOption>createList("options", ReceiptOption.class, QReceiptOption.class, PathInits.DIRECT2);

    public final StringPath orderNumber = createString("orderNumber");

    public final org.kakaoshare.backend.domain.product.entity.QProduct product;

    public final NumberPath<Integer> quantity = createNumber("quantity", Integer.class);

    public final NumberPath<Long> receiptId = createNumber("receiptId", Long.class);

    public final org.kakaoshare.backend.domain.member.entity.QMember receiver;

    public final org.kakaoshare.backend.domain.member.entity.QMember recipient;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QReceipt(String variable) {
        this(Receipt.class, forVariable(variable), INITS);
    }

    public QReceipt(Path<? extends Receipt> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReceipt(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReceipt(PathMetadata metadata, PathInits inits) {
        this(Receipt.class, metadata, inits);
    }

    public QReceipt(Class<? extends Receipt> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.product = inits.isInitialized("product") ? new org.kakaoshare.backend.domain.product.entity.QProduct(forProperty("product"), inits.get("product")) : null;
        this.receiver = inits.isInitialized("receiver") ? new org.kakaoshare.backend.domain.member.entity.QMember(forProperty("receiver")) : null;
        this.recipient = inits.isInitialized("recipient") ? new org.kakaoshare.backend.domain.member.entity.QMember(forProperty("recipient")) : null;
    }

}

