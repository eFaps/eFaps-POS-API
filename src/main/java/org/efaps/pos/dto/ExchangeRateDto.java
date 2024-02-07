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

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = ExchangeRateDto.Builder.class)
public class ExchangeRateDto
{

    private final Currency currency;
    private final BigDecimal exchangeRate;

    private ExchangeRateDto(final Builder builder)
    {
        currency = builder.currency;
        exchangeRate = builder.exchangeRate;
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
        final StringBuilder builder = new StringBuilder();
        builder.append("ExchangeRateDto [currency=").append(currency).append(", exchangeRate=").append(exchangeRate)
                        .append("]");
        return builder.toString();
    }

    /**
     * Creates builder to build {@link ExchangeRateDto}.
     *
     * @return created builder
     */
    public static Builder builder()
    {
        return new Builder();
    }

    /**
     * Builder to build {@link ExchangeRateDto}.
     */
    public static final class Builder
    {

        private Currency currency;
        private BigDecimal exchangeRate;

        private Builder()
        {
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

        public ExchangeRateDto build()
        {
            return new ExchangeRateDto(this);
        }
    }
}
