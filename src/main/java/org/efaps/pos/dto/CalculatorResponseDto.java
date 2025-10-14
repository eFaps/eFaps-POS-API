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

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = CalculatorResponseDto.Builder.class)
public class CalculatorResponseDto
{

    private final BigDecimal netTotal;

    private final BigDecimal crossTotal;

    private final BigDecimal taxTotal;

    private final List<TaxEntryDto> taxes;

    private final List<CalculatorPositionResponseDto> positions;

    private final BigDecimal payableAmount;

    private final PromoInfoDto promotionInfo;

    private final List<LoyaltyInfoDto> loyaltyInfos;


    private CalculatorResponseDto(Builder builder)
    {
        this.netTotal = builder.netTotal;
        this.crossTotal = builder.crossTotal;
        this.taxTotal = builder.taxTotal;
        this.taxes = builder.taxes;
        this.positions = builder.positions;
        this.payableAmount = builder.payableAmount;
        this.promotionInfo = builder.promotionInfo;
        this.loyaltyInfos = builder.loyaltyInfos;
    }

    public BigDecimal getNetTotal()
    {
        return netTotal;
    }

    public BigDecimal getCrossTotal()
    {
        return crossTotal;
    }

    public BigDecimal getTaxTotal()
    {
        return taxTotal;
    }

    public List<TaxEntryDto> getTaxes()
    {
        return taxes;
    }

    public List<CalculatorPositionResponseDto> getPositions()
    {
        return positions;
    }

    public BigDecimal getPayableAmount()
    {
        return payableAmount;
    }

    public PromoInfoDto getPromotionInfo()
    {
        return promotionInfo;
    }

    public List<LoyaltyInfoDto> getLoyaltyInfos()
    {
        return loyaltyInfos;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append("CalculatorResponseDto [netTotal=").append(netTotal)
                        .append(", crossTotal=").append(crossTotal)
                        .append(", taxTotal=").append(taxTotal)
                        .append(", taxes=").append(taxes)
                        .append(", positions=").append(positions)
                        .append(", payableAmount=").append(payableAmount)
                        .append(", promotionInfo=").append(promotionInfo)
                        .append(", loyaltyInfos=").append(loyaltyInfos)
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
        private BigDecimal taxTotal;
        private List<TaxEntryDto> taxes = Collections.emptyList();
        private List<CalculatorPositionResponseDto> positions = Collections.emptyList();
        private BigDecimal payableAmount;
        private PromoInfoDto promotionInfo;
        private List<LoyaltyInfoDto> loyaltyInfos = Collections.emptyList();

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

        public Builder withTaxTotal(BigDecimal taxTotal)
        {
            this.taxTotal = taxTotal;
            return this;
        }

        public Builder withTaxes(List<TaxEntryDto> taxes)
        {
            this.taxes = taxes;
            return this;
        }

        public Builder withPositions(List<CalculatorPositionResponseDto> positions)
        {
            this.positions = positions;
            return this;
        }

        public Builder withPayableAmount(BigDecimal payableAmount)
        {
            this.payableAmount = payableAmount;
            return this;
        }

        public Builder withPromotionInfo(PromoInfoDto promotionInfo)
        {
            this.promotionInfo = promotionInfo;
            return this;
        }

        public Builder withLoyaltyInfos(List<LoyaltyInfoDto> loyaltyInfos)
        {
            this.loyaltyInfos = loyaltyInfos;
            return this;
        }

        public CalculatorResponseDto build()
        {
            return new CalculatorResponseDto(this);
        }
    }
}
