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

@JsonDeserialize(builder = PaymentElectronicAbstractDto.Builder.class)
@JsonInclude(Include.NON_NULL)
public abstract class PaymentElectronicAbstractDto
    extends PaymentAbstractDto
{

    private final String mappingKey;
    private final String cardLabel;
    private final String serviceProvider;
    private final String authorization;
    private final String operationId;
    private final String cardNumber;
    private final String equipmentIdent;

    protected PaymentElectronicAbstractDto(final Builder<?> builder)
    {
        super(builder);
        cardLabel = builder.cardLabel;
        mappingKey = builder.mappingKey;
        serviceProvider = builder.serviceProvider;
        authorization = builder.authorization;
        operationId = builder.operationId;
        cardNumber = builder.cardNumber;
        equipmentIdent = builder.equipmentIdent;
    }

    public String getCardLabel()
    {
        return cardLabel;
    }

    public String getMappingKey()
    {
        return mappingKey;
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

    public String getEquipmentIdent()
    {
        return equipmentIdent;
    }

    public String getCardNumber()
    {
        return cardNumber;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", cardLabel=").append(cardLabel)
                        .append(", mappingKey=").append(mappingKey)
                        .append(", serviceProvider=").append(serviceProvider)
                        .append(", authorization=").append(authorization)
                        .append(", operationId=").append(operationId)
                        .append(", cardNumber=").append(cardNumber)
                        .append("]").toString();
    }

    public static class Builder<S extends Builder<S>>
        extends PaymentAbstractDto.Builder<S>
    {

        private String cardLabel;
        private String mappingKey;
        private String serviceProvider;
        private String authorization;
        private String operationId;
        private String cardNumber;
        private String equipmentIdent;

        @SuppressWarnings("unchecked")
        public S withCardLabel(final String _cardLabel)
        {
            cardLabel = _cardLabel;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withMappingKey(final String _mappingKey)
        {
            mappingKey = _mappingKey;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withServiceProvider(final String serviceProvider)
        {
            this.serviceProvider = serviceProvider;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withEquipmentIdent(final String equipmentIdent)
        {
            this.equipmentIdent = equipmentIdent;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withAuthorization(final String authorization)
        {
            this.authorization = authorization;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withOperationId(final String operationId)
        {
            this.operationId = operationId;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withCardNumber(final String cardNumber)
        {
            this.cardNumber = cardNumber;
            return (S) this;
        }
    }
}
