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

public abstract class PaymentAbstractDto
    extends AbstractObjectDto
    implements IPaymentDto
{

    private final BigDecimal amount;
    private final Currency currency;
    private final BigDecimal exchangeRate;
    private final String info;
    private final OffsetDateTime operationDateTime;

    protected PaymentAbstractDto(final Builder<?> builder)
    {
        super(builder);
        amount = builder.amount;
        currency = builder.currency == null ? Currency.PEN : builder.currency;
        exchangeRate = builder.exchangeRate == null ? BigDecimal.ONE : builder.exchangeRate;
        info = builder.info;
        operationDateTime = builder.operationDateTime;
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

    public String getInfo()
    {
        return info;
    }

    public OffsetDateTime getOperationDateTime()
    {
        return operationDateTime;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", amount=").append(amount)
                        .append(", currency=").append(currency)
                        .append(", exchangeRate=").append(exchangeRate)
                        .append(", info=").append(info)
                        .append(", operationDateTime=").append(operationDateTime)
                        .toString();
    }

    public static abstract class Builder<S extends Builder<S>>
        extends AbstractObjectDto.Builder<S>
    {

        private BigDecimal amount;
        private Currency currency;
        private BigDecimal exchangeRate;
        private String info;
        private OffsetDateTime operationDateTime;

        @SuppressWarnings("unchecked")
        public S withAmount(final BigDecimal amount)
        {
            this.amount = amount;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withCurrency(final Currency currency)
        {
            this.currency = currency;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withExchangeRate(final BigDecimal exchangeRate)
        {
            this.exchangeRate = exchangeRate;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withInfo(final String info)
        {
            this.info = info;
            return (S) this;
        }
        @SuppressWarnings("unchecked")
        public S withOperationDateTime(final OffsetDateTime operationDateTime)
        {
            this.operationDateTime = operationDateTime;
            return (S) this;
        }
    }
}
