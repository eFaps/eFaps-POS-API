/*
 * Copyright © 2003 - 2024 The eFaps Team (-)
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
 */
package org.efaps.pos.dto;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = PaymentDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentDto
    extends AbstractObjectDto
{

    private final PaymentType type;
    private final BigDecimal amount;
    private final Currency currency;
    private final BigDecimal exchangeRate;
    private final Long cardTypeId;
    private final String cardLabel;
    private final String mappingKey;
    private final String serviceProvider;
    private final String authorization;
    private final OffsetDateTime operationDateTime;
    private final String operationId;
    private final String info;
    private final String cardNumber;
    private final String equipmentIdent;

    protected PaymentDto(final Builder _builder)
    {
        super(_builder);
        type = _builder.type;
        amount = _builder.amount;
        currency = _builder.currency == null ? Currency.PEN : _builder.currency;
        exchangeRate = _builder.exchangeRate == null ? BigDecimal.ONE : _builder.exchangeRate;
        cardTypeId = _builder.cardTypeId;
        cardLabel = _builder.cardLabel;
        mappingKey = _builder.mappingKey;
        serviceProvider = _builder.serviceProvider;
        authorization = _builder.authorization;
        operationDateTime = _builder.operationDateTime;
        operationId = _builder.operationId;
        info = _builder.info;
        cardNumber = _builder.cardNumber;
        equipmentIdent = _builder.equipmentIdent;
    }

    public PaymentType getType()
    {
        return type;
    }

    public BigDecimal getAmount()
    {
        return amount;
    }

    public Currency getCurrency()
    {
        return currency;
    }

    public BigDecimal getExchangeRate()
    {
        return exchangeRate;
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

    public String getServiceProvider()
    {
        return serviceProvider;
    }

    public String getAuthorization()
    {
        return authorization;
    }

    public OffsetDateTime getOperationDateTime()
    {
        return operationDateTime;
    }

    public String getOperationId()
    {
        return operationId;
    }

    public String getEquipmentIdent()
    {
        return equipmentIdent;
    }

    public String getInfo()
    {
        return info;
    }

    public String getCardNumber()
    {
        return cardNumber;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", type=").append(type)
                        .append(", amount=").append(amount)
                        .append(", currency=").append(currency)
                        .append(", exchangeRate=").append(exchangeRate)
                        .append(", cardTypeId=").append(cardTypeId)
                        .append(", cardLabel=").append(cardLabel)
                        .append(", mappingKey=").append(mappingKey)
                        .append(", serviceProvider=").append(serviceProvider)
                        .append(", authorization=").append(authorization)
                        .append(", operationDateTime=").append(operationDateTime)
                        .append(", operationId=").append(operationId)
                        .append(", info=").append(info)
                        .append(", cardNumber=").append(cardNumber)
                        .append("]").toString();
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
        private Currency currency;
        private BigDecimal exchangeRate;
        private Long cardTypeId;
        private String cardLabel;
        private String mappingKey;
        private String serviceProvider;
        private String authorization;
        private OffsetDateTime operationDateTime;
        private String operationId;
        private String cardNumber;
        private String equipmentIdent;
        private String info;

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

        public Builder withCurrency(final Currency currency)
        {
            this.currency = currency;
            return this;
        }

        public Builder withExchangeRate(final BigDecimal exchangeRate)
        {
            this.exchangeRate = exchangeRate;
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

        public Builder withServiceProvider(final String serviceProvider)
        {
            this.serviceProvider = serviceProvider;
            return this;
        }

        public Builder withEquipmentIdent(final String equipmentIdent)
        {
            this.equipmentIdent = equipmentIdent;
            return this;
        }

        public Builder withAuthorization(final String authorization)
        {
            this.authorization = authorization;
            return this;
        }

        public Builder withOperationDateTime(final OffsetDateTime operationDateTime)
        {
            this.operationDateTime = operationDateTime;
            return this;
        }

        public Builder withOperationId(final String operationId)
        {
            this.operationId = operationId;
            return this;
        }

        public Builder withInfo(final String info)
        {
            this.info = info;
            return this;
        }

        public Builder withCardNumber(final String cardNumber)
        {
            this.cardNumber = cardNumber;
            return this;
        }

        @Override
        public PaymentDto build()
        {
            return new PaymentDto(this);
        }
    }
}
