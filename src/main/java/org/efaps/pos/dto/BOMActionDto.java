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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = BOMActionDto.Builder.class)
@JsonInclude(value = Include.NON_EMPTY)
public class BOMActionDto
{

    private final BOMActionType type;
    private final BigDecimal netAmount;
    private final BigDecimal crossAmount;

    private BOMActionDto(Builder builder)
    {
        this.type = builder.type;
        this.netAmount = builder.netAmount;
        this.crossAmount = builder.crossAmount;
    }

    public BOMActionType getType()
    {
        return type;
    }

    public BigDecimal getNetAmount()
    {
        return netAmount;
    }


    public BigDecimal getCrossAmount()
    {
        return crossAmount;
    }


    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", type=").append(type)
                        .append(", netAmount=").append(netAmount)
                        .append(", crossAmount=").append(crossAmount)
                        .toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
    {

        private BOMActionType type;
        private BigDecimal netAmount;
        private BigDecimal crossAmount;

        private Builder()
        {
        }

        public Builder withType(BOMActionType type)
        {
            this.type = type;
            return this;
        }

        public Builder withNetAmount(BigDecimal netAmount)
        {
            this.netAmount = netAmount;
            return this;
        }

        public Builder withCrossAmount(BigDecimal crossAmount)
        {
            this.crossAmount = crossAmount;
            return this;
        }

        public BOMActionDto build()
        {
            return new BOMActionDto(this);
        }
    }
}
