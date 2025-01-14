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

@JsonDeserialize(builder = PaymentLoyaltyPointsAbstractDto.Builder.class)
@JsonInclude(Include.NON_NULL)
public abstract class PaymentLoyaltyPointsAbstractDto
    extends PaymentAbstractDto
{

    private final String mappingKey;
    private final String authorization;
    private final String operationId;
    private final Integer pointsAmount;

    protected PaymentLoyaltyPointsAbstractDto(final Builder<?> builder)
    {
        super(builder);
        mappingKey = builder.mappingKey;
        operationId = builder.operationId;
        authorization = builder.authorization;
        pointsAmount = builder.pointsAmount;
    }

    public String getMappingKey()
    {
        return mappingKey;
    }

    public String getAuthorization()
    {
        return authorization;
    }

    public String getOperationId()
    {
        return operationId;
    }

    public Integer getPointsAmount()
    {
        return pointsAmount;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", mappingKey=").append(mappingKey)
                        .append(", authorization=").append(authorization)
                        .append(", operationId=").append(operationId)
                        .append(", pointsAmount=").append(pointsAmount)
                        .append("]").toString();
    }

    public static class Builder<S extends Builder<S>>
        extends PaymentAbstractDto.Builder<S>
    {
        private String mappingKey;
        private String authorization;
        private String operationId;
        private Integer pointsAmount;

        @SuppressWarnings("unchecked")
        public S withMappingKey(final String _mappingKey)
        {
            mappingKey = _mappingKey;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withOperationId(final String operationId)
        {
            this.operationId = operationId;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withAuthorization(final String authorization)
        {
            this.authorization = authorization;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withPointsAmount(final Integer pointsAmount)
        {
            this.pointsAmount = pointsAmount;
            return (S) this;
        }
    }
}
