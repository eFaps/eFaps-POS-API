/*
 * Copyright 2003 - 2021 The eFaps Team
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

@JsonDeserialize(builder = TaxDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxDto
    extends AbstractObjectDto
{

    private final String key;
    private final String catKey;
    private final String name;
    private final BigDecimal percent;
    private final TaxType type;
    private final BigDecimal amount;
    private final Currency currency;
    private final BigDecimal exchangeRate;

    private TaxDto(final Builder _builder)
    {
        super(_builder);
        key = _builder.key;
        catKey = _builder.catKey;
        name = _builder.name;
        percent = _builder.percent;
        type = _builder.type;
        amount = _builder.amount;
        currency = _builder.currency;
        exchangeRate = _builder.exchangeRate;
    }

    public String getKey()
    {
        return key;
    }

    public String getCatKey()
    {
        return catKey;
    }

    public TaxType getType()
    {
        return type;
    }

    public String getName()
    {
        return name;
    }

    public BigDecimal getPercent()
    {
        return percent;
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
        return new StringBuilder()
                        .append(super.toString())
                        .append(", key=").append(key)
                        .append(", catKey=").append(catKey)
                        .append(", name=").append(name)
                        .append(", percent=").append(percent)
                        .append(", type=").append(type)
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
        extends AbstractObjectDto.Builder<Builder, TaxDto>
    {

        private String key;
        private String catKey;
        private String name;
        private TaxType type;
        private BigDecimal percent;
        private BigDecimal amount;
        private Currency currency;
        private BigDecimal exchangeRate;

        public Builder withKey(final String _key)
        {
            key = _key;
            return this;
        }

        public Builder withCatKey(final String _catKey)
        {
            catKey = _catKey;
            return this;
        }

        public Builder withType(final TaxType _type)
        {
            type = _type;
            return this;
        }

        public Builder withName(final String _name)
        {
            name = _name;
            return this;
        }

        public Builder withPercent(final BigDecimal _percent)
        {
            percent = _percent;
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

        @Override
        public TaxDto build()
        {
            return new TaxDto(this);
        }
    }
}
