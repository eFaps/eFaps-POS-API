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

@JsonDeserialize(builder = PaymentDto.Builder.class)
public class PaymentDto
    extends AbstractDto
{

    private final PaymentType type;
    private final BigDecimal amount;

    private PaymentDto(final Builder _builder)
    {
        super(_builder);
        this.type = _builder.type;
        this.amount = _builder.amount;
    }

    public PaymentType getType()
    {
        return this.type;
    }

    public BigDecimal getAmount()
    {
        return this.amount;
    }

    /**
     * Builder to build {@link AgendaDto}.
     */
    public static class Builder
        extends AbstractDto.Builder<Builder, PaymentDto>
    {

        private PaymentType type;
        private BigDecimal amount;

        public Builder withType(final PaymentType _type)
        {
            this.type = _type;
            return this;
        }

        public Builder withAmount(final BigDecimal _amount)
        {
            this.amount = _amount;
            return this;
        }

        @Override
        public PaymentDto build()
        {
            return new PaymentDto(this);
        }
    }
}
