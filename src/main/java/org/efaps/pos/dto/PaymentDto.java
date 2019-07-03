/*
 * Copyright 2003 - 2019 The eFaps Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.efaps.pos.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.math.BigDecimal;

@JsonDeserialize(builder = PaymentDto.Builder.class)
public class PaymentDto
    extends AbstractObjectDto
{

    private final PaymentType type;
    private final BigDecimal amount;
    private final Long cardTypeId;
    private final String cardLabel;

    private PaymentDto(final Builder _builder)
    {
        super(_builder);
        type = _builder.type;
        amount = _builder.amount;
        cardTypeId = _builder.cardTypeId;
        cardLabel = _builder.cardLabel;
    }

    public PaymentType getType()
    {
        return type;
    }

    public BigDecimal getAmount()
    {
        return amount;
    }

    public Long getCardTypeId()
    {
        return cardTypeId;
    }

    public String getCardLabel()
    {
        return cardLabel;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static class Builder
        extends AbstractObjectDto.Builder<Builder, PaymentDto>
    {

        private PaymentType type;
        private BigDecimal amount;
        private Long cardTypeId;
        private String cardLabel;

        public Builder withType(final PaymentType _type)
        {
            type = _type;
            return this;
        }

        public Builder withAmount(final BigDecimal _amount)
        {
            amount = _amount;
            return this;
        }

        public Builder withCardTypeId(final Long _cardTypeId)
        {
            cardTypeId = _cardTypeId;
            return this;
        }

        public Builder withCardLabel(final String _cardLabel)
        {
            cardLabel = _cardLabel;
            return this;
        }

        @Override
        public PaymentDto build()
        {
            return new PaymentDto(this);
        }
    }
}
