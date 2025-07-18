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

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = StoreStatusResponseDto.Builder.class)
public class StoreStatusResponseDto
{

    private final List<StoreStatus> status;

    private StoreStatusResponseDto(Builder builder)
    {
        this.status = builder.status;
    }

    public List<StoreStatus> getStatus()
    {
        return status;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append("status=").append(status)
                        .toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
    {

        private List<StoreStatus> status;

        private Builder()
        {
        }

        public Builder withStatus(List<StoreStatus> status)
        {
            this.status = status;
            return this;
        }

        public StoreStatusResponseDto build()
        {
            return new StoreStatusResponseDto(this);
        }
    }
}
