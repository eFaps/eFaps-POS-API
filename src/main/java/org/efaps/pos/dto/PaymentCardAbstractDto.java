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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = PaymentCardAbstractDto.Builder.class)
@JsonInclude(Include.NON_NULL)
public abstract class PaymentCardAbstractDto
    extends PaymentAbstractDto
{

    private final String cardTypeId;
    private final String cardLabel;
    private final String cardNumber;
    private final String serviceProvider;
    private final String authorization;
    private final String operationId;

    protected PaymentCardAbstractDto(final Builder<?> builder)
    {
        super(builder);
        this.cardTypeId = builder.cardTypeId;
        this.cardNumber = builder.cardNumber;
        this.serviceProvider = builder.serviceProvider;
        this.authorization = builder.authorization;
        this.operationId = builder.operationId;
        this.cardLabel = builder.cardLabel;
    }

    public String getCardTypeId()
    {
        return cardTypeId;
    }

    public String getCardLabel()
    {
        return cardLabel;
    }

    public String getCardNumber()
    {
        return cardNumber;
    }

    public String getServiceProvider()
    {
        return serviceProvider;
    }

    public String getAuthorization()
    {
        return authorization;
    }

    public String getOperationId()
    {
        return operationId;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", cardTypeId=").append(cardTypeId)
                        .append(", cardNumber=").append(cardNumber)
                        .append(", serviceProvider=").append(serviceProvider)
                        .append(", authorization=").append(authorization)
                        .append(", operationId=").append(operationId)
                        .append("]").toString();
    }

    public static abstract class Builder<S extends Builder<S>>
        extends PaymentAbstractDto.Builder<S>
    {

        private String cardLabel;
        private String cardTypeId;
        private String cardNumber;
        private String serviceProvider;
        private String authorization;
        private String operationId;

        @SuppressWarnings("unchecked")
        public S withCardTypeId(String cardTypeId)
        {
            this.cardTypeId = cardTypeId;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withCardLabel(String cardLabel)
        {
            this.cardLabel = cardLabel;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withCardNumber(String cardNumber)
        {
            this.cardNumber = cardNumber;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withServiceProvider(String serviceProvider)
        {
            this.serviceProvider = serviceProvider;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withAuthorization(String authorization)
        {
            this.authorization = authorization;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withOperationId(String operationId)
        {
            this.operationId = operationId;
            return (S) this;
        }
    }
}
