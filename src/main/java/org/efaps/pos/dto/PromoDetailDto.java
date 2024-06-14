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

@JsonDeserialize(builder = PromoDetailDto.Builder.class)
public class PromoDetailDto
{

    private final int index;

    private final BigDecimal discount;

    private final String promotionOid;

    private PromoDetailDto(Builder builder)
    {
        this.index = builder.index;
        this.discount = builder.discount;
        this.promotionOid = builder.promotionOid;
    }

    public int getIndex()
    {
        return index;
    }

    public BigDecimal getDiscount()
    {
        return discount;
    }

    public String getPromotionOid()
    {
        return promotionOid;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", index=").append(index)
                        .append(", discount=").append(discount)
                        .append(", promotionOid=").append(promotionOid)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
    {

        private int index;
        private BigDecimal discount;
        private String promotionOid;

        private Builder()
        {
        }

        public Builder withIndex(int index)
        {
            this.index = index;
            return this;
        }

        public Builder withDiscount(BigDecimal discount)
        {
            this.discount = discount;
            return this;
        }

        public Builder withPromotionOid(String promotionOid)
        {
            this.promotionOid = promotionOid;
            return this;
        }

        public PromoDetailDto build()
        {
            return new PromoDetailDto(this);
        }
    }
}
