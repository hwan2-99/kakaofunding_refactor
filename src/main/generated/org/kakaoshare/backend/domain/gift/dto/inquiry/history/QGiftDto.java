package org.kakaoshare.backend.domain.gift.dto.inquiry.history;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * org.kakaoshare.backend.domain.gift.dto.inquiry.history.QGiftDto is a Querydsl Projection type for GiftDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QGiftDto extends ConstructorExpression<GiftDto> {

    private static final long serialVersionUID = -1386111735L;

    public QGiftDto(com.querydsl.core.types.Expression<Long> giftId, com.querydsl.core.types.Expression<java.time.LocalDateTime> expiredAt, com.querydsl.core.types.Expression<java.time.LocalDateTime> createdAt, com.querydsl.core.types.Expression<String> senderName, com.querydsl.core.types.Expression<String> senderProviderId, com.querydsl.core.types.Expression<? extends org.kakaoshare.backend.domain.product.dto.ProductDto> productDto) {
        super(GiftDto.class, new Class<?>[]{long.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, String.class, String.class, org.kakaoshare.backend.domain.product.dto.ProductDto.class}, giftId, expiredAt, createdAt, senderName, senderProviderId, productDto);
    }

}

