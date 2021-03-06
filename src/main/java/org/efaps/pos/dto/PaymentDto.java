/*
 * Copyright 2003 - 2020 The eFaps Team
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

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = PaymentDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentDto
    extends AbstractObjectDto
{

    private final PaymentType type;
    private final BigDecimal amount;
    private final Long cardTypeId;
    private final String cardLabel;
    private final String mappingKey;

    private PaymentDto(final Builder _builder)
    {
        super(_builder);
        type = _builder.type;
        amount = _builder.amount;
        cardTypeId = _builder.cardTypeId;
        cardLabel = _builder.cardLabel;
        mappingKey = _builder.mappingKey;
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

    public String getMappingKey()
    {
        return mappingKey;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder
        extends AbstractObjectDto.Builder<Builder, PaymentDto>
    {

        private PaymentType type;
        private BigDecimal amount;
        private Long cardTypeId;
        private String cardLabel;
        private String mappingKey;

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

        public Builder withMappingKey(final String _mappingKey)
        {
            mappingKey = _mappingKey;
            return this;
        }

        @Override
        public PaymentDto build()
        {
            return new PaymentDto(this);
        }
    }
}
