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
import java.util.Set;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = PromoInfoDto.Builder.class)
public class PromoInfoDto
{

    private final BigDecimal netTotalDiscount;

    private final BigDecimal crossTotalDiscount;

    private final List<PromoDetailDto> details;

    private final Set<String> promotionOids;

    private PromoInfoDto(Builder builder)
    {
        this.netTotalDiscount = builder.netTotalDiscount;
        this.crossTotalDiscount = builder.crossTotalDiscount;
        this.details = builder.details;
        this.promotionOids = builder.promotionOids;
    }

    public BigDecimal getNetTotalDiscount()
    {
        return netTotalDiscount;
    }

    public BigDecimal getCrossTotalDiscount()
    {
        return crossTotalDiscount;
    }

    public List<PromoDetailDto> getDetails()
    {
        return details;
    }

    public Set<String> getPromotionOids()
    {
        return promotionOids;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", netTotalDiscount=").append(netTotalDiscount)
                        .append(", crossTotalDiscount=").append(crossTotalDiscount)
                        .append(", details=").append(details)
                        .append(", promotionOids=").append(promotionOids)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
    {

        private BigDecimal netTotalDiscount;
        private BigDecimal crossTotalDiscount;
        private List<PromoDetailDto> details = Collections.emptyList();
        private Set<String> promotionOids = Collections.emptySet();

        private Builder()
        {
        }

        public Builder withNetTotalDiscount(BigDecimal netTotalDiscount)
        {
            this.netTotalDiscount = netTotalDiscount;
            return this;
        }

        public Builder withCrossTotalDiscount(BigDecimal crossTotalDiscount)
        {
            this.crossTotalDiscount = crossTotalDiscount;
            return this;
        }

        public Builder withDetails(List<PromoDetailDto> details)
        {
            this.details = details;
            return this;
        }

        public Builder withPromotionOids(Set<String> promotionOids)
        {
            this.promotionOids = promotionOids;
            return this;
        }

        public PromoInfoDto build()
        {
            return new PromoInfoDto(this);
        }
    }
}
