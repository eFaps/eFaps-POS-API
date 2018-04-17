/*
 * Copyright 2003 - 2018 The eFaps Team
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

@JsonDeserialize(builder = TaxEntryDto.Builder.class)
public class TaxEntryDto
{

    private final TaxDto tax;
    private final BigDecimal amount;

    private TaxEntryDto(final Builder _builder)
    {
        this.tax = _builder.tax;
        this.amount = _builder.amount;
    }

    public TaxDto getTax()
    {
        return this.tax;
    }

    public BigDecimal getAmount()
    {
        return this.amount;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
    {
        private TaxDto tax;
        private BigDecimal amount;

        public Builder withTax(final TaxDto _tax)
        {
            this.tax = _tax;
            return this;
        }

        public Builder withAmount(final BigDecimal _amount)
        {
            this.amount = _amount;
            return this;
        }

        public TaxEntryDto build()
        {
            return new TaxEntryDto(this);
        }
    }
}
