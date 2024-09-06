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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = BOMActionDto.Builder.class)
@JsonInclude(value = Include.NON_EMPTY)
public class BOMActionDto
{

    private final BOMActionType type;
    private final BigDecimal amount;

    private BOMActionDto(Builder builder)
    {
        this.type = builder.type;
        this.amount = builder.amount;
    }

    public BOMActionType getType()
    {
        return type;
    }

    public BigDecimal getAmount()
    {
        return amount;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", type=").append(type)
                        .append(", amount=").append(amount)
                        .toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
    {

        private BOMActionType type;
        private BigDecimal amount;

        private Builder()
        {
        }

        public Builder withType(BOMActionType type)
        {
            this.type = type;
            return this;
        }

        public Builder withAmount(BigDecimal amount)
        {
            this.amount = amount;
            return this;
        }

        public BOMActionDto build()
        {
            return new BOMActionDto(this);
        }
    }
}
