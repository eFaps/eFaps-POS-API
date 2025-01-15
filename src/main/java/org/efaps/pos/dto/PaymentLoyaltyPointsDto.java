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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = PaymentLoyaltyPointsDto.Builder.class)
@JsonInclude(Include.NON_NULL)
public class PaymentLoyaltyPointsDto
    extends PaymentLoyaltyPointsAbstractDto
    implements IPaymentDto
{

    private final PaymentType type;

    protected PaymentLoyaltyPointsDto(final Builder builder)
    {
        super(builder);
        this.type = builder.type;
    }

    @Override
    public PaymentType getType()
    {
        return type;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", type=").append(type)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder
        extends PaymentLoyaltyPointsAbstractDto.Builder<Builder>
    {

        private final PaymentType type = PaymentType.LOYALTY_POINTS;

        public Builder withType(PaymentType type)
        {
            return this;
        }

        public PaymentLoyaltyPointsDto build()
        {
            return new PaymentLoyaltyPointsDto(this);
        }
    }
}
