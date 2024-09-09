package org.kakaoshare.backend.domain.order.dto.inquiry;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * org.kakaoshare.backend.domain.order.dto.inquiry.QOrderProductDto is a Querydsl Projection type for OrderProductDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QOrderProductDto extends ConstructorExpression<OrderProductDto> {

    private static final long serialVersionUID = -2055204224L;

    public QOrderProductDto(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<String> orderNumber, com.querydsl.core.types.Expression<String> receiverName, com.querydsl.core.types.Expression<String> receiverProviderId, com.querydsl.core.types.Expression<? extends org.kakaoshare.backend.domain.product.dto.ProductDto> product, com.querydsl.core.types.Expression<Integer> quantity, com.querydsl.core.types.Expression<java.time.LocalDateTime> orderDate, com.querydsl.core.types.Expression<String> status) {
        super(OrderProductDto.class, new Class<?>[]{long.class, String.class, String.class, String.class, org.kakaoshare.backend.domain.product.dto.ProductDto.class, int.class, java.time.LocalDateTime.class, String.class}, id, orderNumber, receiverName, receiverProviderId, product, quantity, orderDate, status);
    }

}

