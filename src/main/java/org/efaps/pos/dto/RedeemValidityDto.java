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

import javax.annotation.processing.Generated;

import tools.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = RedeemValidityDto.Builder.class)
public class RedeemValidityDto
{
    private final RedeemValidityStatus status;

    @Generated("SparkTools")
    private RedeemValidityDto(Builder builder)
    {
        this.status = builder.status;
    }

    public RedeemValidityStatus getStatus()
    {
        return status;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", status=").append(status)
                        .append("]").toString();
    }

    @Generated("SparkTools")
    public static Builder builder()
    {
        return new Builder();
    }

    @Generated("SparkTools")
    public static final class Builder
    {

        private RedeemValidityStatus status;

        private Builder()
        {
        }

        public Builder withStatus(RedeemValidityStatus status)
        {
            this.status = status;
            return this;
        }

        public RedeemValidityDto build()
        {
            return new RedeemValidityDto(this);
        }
    }
}
