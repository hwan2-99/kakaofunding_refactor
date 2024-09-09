package org.kakaoshare.backend.domain.receipt.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReceiptOption is a Querydsl query type for ReceiptOption
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReceiptOption extends EntityPathBase<ReceiptOption> {

    private static final long serialVersionUID = 1857605312L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReceiptOption receiptOption = new QReceiptOption("receiptOption");

    public final StringPath optionDetailName = createString("optionDetailName");

    public final StringPath optionName = createString("optionName");

    public final QReceipt receipt;

    public final NumberPath<Long> receipt_option_id = createNumber("receipt_option_id", Long.class);

    public QReceiptOption(String variable) {
        this(ReceiptOption.class, forVariable(variable), INITS);
    }

    public QReceiptOption(Path<? extends ReceiptOption> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReceiptOption(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReceiptOption(PathMetadata metadata, PathInits inits) {
        this(ReceiptOption.class, metadata, inits);
    }

    public QReceiptOption(Class<? extends ReceiptOption> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.receipt = inits.isInitialized("receipt") ? new QReceipt(forProperty("receipt"), inits.get("receipt")) : null;
    }

}

