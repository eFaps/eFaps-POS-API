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
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = PromoDetailDto.Builder.class)
public class PromoDetailDto
{

    private final int positionIndex;

    private final BigDecimal netUnitBase;

    private final BigDecimal netBase;

    private final BigDecimal netUnitDiscount;

    private final BigDecimal netDiscount;

    private final BigDecimal crossUnitDiscount;

    private final BigDecimal crossDiscount;

    private final String promotionOid;

    private PromoDetailDto(Builder builder)
    {
        this.positionIndex = builder.positionIndex;
        this.netUnitBase = builder.netUnitBase;
        this.netBase = builder.netBase;
        this.netUnitDiscount = builder.netUnitDiscount;
        this.netDiscount = builder.netDiscount;
        this.crossUnitDiscount = builder.crossUnitDiscount;
        this.crossDiscount = builder.crossDiscount;
        this.promotionOid = builder.promotionOid;
    }

    @Deprecated
    public int getIndex()
    {
        return getPositionIndex();
    }

    @Deprecated
    public List<String> getPromotionOids()
    {
        return promotionOid == null ? Collections.emptyList() : Collections.singletonList(promotionOid);
    }

    public int getPositionIndex()
    {
        return positionIndex;
    }

    public BigDecimal getNetUnitBase()
    {
        return netUnitBase;
    }

    public BigDecimal getNetBase()
    {
        return netBase;
    }

    public BigDecimal getNetUnitDiscount()
    {
        return netUnitDiscount;
    }

    public BigDecimal getNetDiscount()
    {
        return netDiscount;
    }

    public BigDecimal getCrossDiscount()
    {
        return crossDiscount;
    }

    public BigDecimal getCrossUnitDiscount()
    {
        return crossUnitDiscount;
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
                        .append(", positionIndex=").append(positionIndex)
                        .append(", netUnitBase=").append(netUnitBase)
                        .append(", netBase=").append(netBase)
                        .append(", netUnitDiscount=").append(netUnitDiscount)
                        .append(", netDiscount=").append(netDiscount)
                        .append(", crossUnitDiscount=").append(crossUnitDiscount)
                        .append(", crossDiscount=").append(crossDiscount)
                        .append(", promotionOid=").append(promotionOid)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
    {

        private int positionIndex;
        private BigDecimal netUnitBase;
        private BigDecimal netBase;
        private BigDecimal netUnitDiscount;
        private BigDecimal netDiscount;
        private BigDecimal crossUnitDiscount;
        private BigDecimal crossDiscount;
        private String promotionOid;

        private Builder()
        {
        }

        public Builder withPositionIndex(int positionIndex)
        {
            this.positionIndex = positionIndex;
            return this;
        }

        public Builder withNetUnitBase(BigDecimal netUnitBase)
        {
            this.netUnitBase = netUnitBase;
            return this;
        }

        public Builder withNetBase(BigDecimal netBase)
        {
            this.netBase = netBase;
            return this;
        }

        public Builder withNetUnitDiscount(BigDecimal netUnitDiscount)
        {
            this.netUnitDiscount = netUnitDiscount;
            return this;
        }

        public Builder withNetDiscount(BigDecimal netDiscount)
        {
            this.netDiscount = netDiscount;
            return this;
        }

        public Builder withCrossUnitDiscount(BigDecimal crossUnitDiscount)
        {
            this.crossUnitDiscount = crossUnitDiscount;
            return this;
        }

        public Builder withCrossDiscount(BigDecimal crossDiscount)
        {
            this.crossDiscount = crossDiscount;
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
