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

@JsonDeserialize(builder = PaymentRedeemAbstractDto.Builder.class)
@JsonInclude(Include.NON_NULL)
public abstract class PaymentRedeemAbstractDto
    extends PaymentAbstractDto
    implements IPaymentDto
{

    private final String redeemDocOid;

    protected PaymentRedeemAbstractDto(final Builder<?> builder)
    {
        super(builder);
        this.redeemDocOid = builder.redeemDocOid;
    }

    public String getRedeemDocOid()
    {
        return redeemDocOid;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", redeemDocOid=").append(redeemDocOid).toString();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class Builder<S extends Builder<S>>
        extends PaymentAbstractDto.Builder<S>
    {

        private String redeemDocOid;

        @SuppressWarnings("unchecked")
        public S withRedeemDocOid(final String redeemDocOid)
        {
            this.redeemDocOid = redeemDocOid;
            return (S) this;
        }
    }
}
