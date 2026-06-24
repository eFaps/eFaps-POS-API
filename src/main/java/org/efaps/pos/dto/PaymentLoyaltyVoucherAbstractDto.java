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

import tools.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = PaymentLoyaltyVoucherAbstractDto.Builder.class)
@JsonInclude(Include.NON_NULL)
public abstract class PaymentLoyaltyVoucherAbstractDto
    extends PaymentAbstractDto
    implements IPaymentDto
{

    private final String identifier;

    protected PaymentLoyaltyVoucherAbstractDto(final Builder<?> builder)
    {
        super(builder);
        this.identifier = builder.identifier;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", identifier=").append(identifier)
                        .toString();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class Builder<S extends Builder<S>>
        extends PaymentAbstractDto.Builder<S>
    {
        private String identifier;

        @SuppressWarnings("unchecked")
        public S withIdentifier(final String identifier)
        {
            this.identifier = identifier;
            return (S) this;
        }
    }
}
