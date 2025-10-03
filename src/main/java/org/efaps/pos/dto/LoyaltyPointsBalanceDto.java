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
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = LoyaltyPointsBalanceDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoyaltyPointsBalanceDto
{

    private final ContactDto contact;

    private final Integer points;

    private final BigDecimal equivalentAmount;

    private final Currency equivalentCurrency;

    private final Map<String, Object> extend;

    private LoyaltyPointsBalanceDto(Builder builder)
    {
        this.contact = builder.contact;
        this.points = builder.points;
        this.equivalentAmount = builder.equivalentAmount;
        this.equivalentCurrency = builder.equivalentCurrency;
        this.extend = builder.extend;
    }

    public ContactDto getContact()
    {
        return contact;
    }

    public Integer getPoints()
    {
        return points;
    }

    public BigDecimal getEquivalentAmount()
    {
        return equivalentAmount;
    }

    public Currency getEquivalentCurrency()
    {
        return equivalentCurrency;
    }

    @JsonInclude(Include.NON_EMPTY)
    public Map<String, Object> getExtend()
    {
        return extend;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", points=").append(points)
                        .append(", equivalentAmount=").append(equivalentAmount)
                        .append(", equivalentCurrency=").append(equivalentCurrency)
                        .append(", contact=").append(contact)
                        .append(", extend=").append(extend)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
    {

        private ContactDto contact;
        private Integer points;
        private BigDecimal equivalentAmount;
        private Currency equivalentCurrency;
        private Map<String, Object> extend = Collections.emptyMap();

        private Builder()
        {
        }

        public Builder withContact(ContactDto contact)
        {
            this.contact = contact;
            return this;
        }

        public Builder withPoints(Integer points)
        {
            this.points = points;
            return this;
        }

        public Builder withEquivalentAmount(BigDecimal equivalentAmount)
        {
            this.equivalentAmount = equivalentAmount;
            return this;
        }

        public Builder withEquivalentCurrency(Currency equivalentCurrency)
        {
            this.equivalentCurrency = equivalentCurrency;
            return this;
        }

        public Builder withExtend(Map<String, Object> extend)
        {
            this.extend = extend;
            return this;
        }

        public LoyaltyPointsBalanceDto build()
        {
            return new LoyaltyPointsBalanceDto(this);
        }
    }
}
