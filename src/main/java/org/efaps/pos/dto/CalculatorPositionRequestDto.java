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

@JsonDeserialize(builder = CalculatorPositionRequestDto.Builder.class)
public class CalculatorPositionRequestDto
{

    private final Integer index;

    private final Integer parentIdx;

    private final BigDecimal quantity;

    private final String productOid;

    private final String bomOid;


    private CalculatorPositionRequestDto(final Builder builder)
    {
        this.index = builder.index;
        this.parentIdx = builder.parentIdx;
        this.quantity = builder.quantity;
        this.productOid = builder.productOid;
        this.bomOid = builder.bomOid;
    }

    public Integer getIndex()
    {
        return index;
    }


    public Integer getParentIdx()
    {
        return parentIdx;
    }

    public String getProductOid()
    {
        return productOid;
    }

    public BigDecimal getQuantity()
    {
        return quantity;
    }

    public String getBomOid()
    {
        return bomOid;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append("CalculatorPositionRequestDto [quantity=").append(quantity)
                        .append(", index=").append(index)
                        .append(", parentIdx=").append(parentIdx)
                        .append(", productOid=").append(productOid)
                        .append(", bomOid=").append(bomOid)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
    {
        private Integer index;
        private Integer parentIdx;
        private BigDecimal quantity;
        private String productOid;
        private String bomOid;

        private Builder()
        {
        }

        public Builder withIndex(Integer index)
        {
            this.index = index;
            return this;
        }

        public Builder withParentIdx(Integer parentIdx)
        {
            this.parentIdx = parentIdx;
            return this;
        }

        public Builder withQuantity(BigDecimal quantity)
        {
            this.quantity = quantity;
            return this;
        }

        public Builder withProductOid(String productOid)
        {
            this.productOid = productOid;
            return this;
        }

        public Builder withBomOid(String bomOid)
        {
            this.bomOid = bomOid;
            return this;
        }

        public CalculatorPositionRequestDto build()
        {
            return new CalculatorPositionRequestDto(this);
        }
    }
}
