package org.kakaoshare.backend.domain.option.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * org.kakaoshare.backend.domain.option.dto.QOptionSummaryResponse is a Querydsl Projection type for OptionSummaryResponse
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QOptionSummaryResponse extends ConstructorExpression<OptionSummaryResponse> {

    private static final long serialVersionUID = 434940050L;

    public QOptionSummaryResponse(com.querydsl.core.types.Expression<String> optionName, com.querydsl.core.types.Expression<String> optionDetailName) {
        super(OptionSummaryResponse.class, new Class<?>[]{String.class, String.class}, optionName, optionDetailName);
    }

}

