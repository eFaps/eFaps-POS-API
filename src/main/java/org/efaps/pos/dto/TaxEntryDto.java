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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = TaxEntryDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxEntryDto
{

    private final TaxDto tax;
    private final BigDecimal base;
    private final BigDecimal amount;
    private final Currency currency;
    private final BigDecimal exchangeRate;

    private TaxEntryDto(final Builder _builder)
    {
        tax = _builder.tax;
        amount = _builder.amount;
        base = _builder.base;
        currency = _builder.currency == null ? Currency.PEN : _builder.currency;
        exchangeRate = _builder.exchangeRate == null ? BigDecimal.ONE : _builder.exchangeRate;
    }

    public TaxDto getTax()
    {
        return tax;
    }

    public BigDecimal getBase()
    {
        return base;
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

    @Override
    public String toString()
    {
        return new StringBuilder().append("TaxEntryDto [tax=").append(tax)
                        .append(", base=").append(base)
                        .append(", amount=").append(amount)
                        .append(", currency=").append(currency)
                        .append(", exchangeRate=").append(exchangeRate)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
    {

        private TaxDto tax;
        private BigDecimal base;
        private BigDecimal amount;
        private Currency currency;
        private BigDecimal exchangeRate;

        public Builder withTax(final TaxDto _tax)
        {
            tax = _tax;
            return this;
        }

        public Builder withBase(final BigDecimal _base)
        {
            base = _base;
            return this;
        }

        public Builder withAmount(final BigDecimal _amount)
        {
            amount = _amount;
            return this;
        }

        public Builder withCurrency(final Currency _currency)
        {
            currency = _currency;
            return this;
        }

        public Builder withExchangeRate(final BigDecimal exchangeRate)
        {
            this.exchangeRate = exchangeRate;
            return this;
        }

        public TaxEntryDto build()
        {
            return new TaxEntryDto(this);
        }
    }
}
