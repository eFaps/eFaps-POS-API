/*
 * Copyright 2003 - 2023 The eFaps Team
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

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = CalculationResponseDto.Builder.class)
public class CalculationResponseDto
{

    private final BigDecimal netTotal;

    private final BigDecimal crossTotal;

    private CalculationResponseDto(Builder builder)
    {
        this.netTotal = builder.netTotal;
        this.crossTotal = builder.crossTotal;
    }

    public BigDecimal getNetTotal()
    {
        return netTotal;
    }

    public BigDecimal getCrossTotal()
    {
        return crossTotal;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append("CalculationResponseDto [netTotal=").append(netTotal)
                        .append(", crossTotal=").append(crossTotal)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
    {

        private BigDecimal netTotal;
        private BigDecimal crossTotal;

        private Builder()
        {
        }

        public Builder withNetTotal(BigDecimal netTotal)
        {
            this.netTotal = netTotal;
            return this;
        }

        public Builder withCrossTotal(BigDecimal crossTotal)
        {
            this.crossTotal = crossTotal;
            return this;
        }

        public CalculationResponseDto build()
        {
            return new CalculationResponseDto(this);
        }
    }
}
