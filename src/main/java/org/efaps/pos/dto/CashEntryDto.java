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

@JsonDeserialize(builder = CashEntryDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CashEntryDto
{

    private final String balanceOid;
    private final CashEntryType entryType;
    private final BigDecimal amount;
    private final Currency currency;

    private CashEntryDto(final Builder builder)
    {
        balanceOid = builder.balanceOid;
        entryType = builder.entryType;
        amount = builder.amount;
        currency = builder.currency;
    }

    public String getBalanceOid()
    {
        return balanceOid;
    }

    public CashEntryType getEntryType()
    {
        return entryType;
    }

    public BigDecimal getAmount()
    {
        return amount;
    }

    public Currency getCurrency()
    {
        return currency;
    }

    @Override
    public String toString()
    {
        return new StringBuilder().append("CashEntry ")
                        .append("[balanceOid=").append(balanceOid)
                        .append(", entryType=").append(entryType)
                        .append(", amount=").append(amount)
                        .append(", currency=").append(currency)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
    {

        private String balanceOid;
        private CashEntryType entryType;
        private BigDecimal amount;
        private Currency currency;

        public Builder withBalanceOid(final String balanceOid)
        {
            this.balanceOid = balanceOid;
            return this;
        }

        public Builder withEntryType(final CashEntryType entryType)
        {
            this.entryType = entryType;
            return this;
        }

        public Builder withAmount(final BigDecimal amount)
        {
            this.amount = amount;
            return this;
        }

        public Builder withCurrency(final Currency currency)
        {
            this.currency = currency;
            return this;
        }

        public CashEntryDto build()
        {
            return new CashEntryDto(this);
        }
    }
}
