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

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = LoyaltyInfoDto.Builder.class)
public class LoyaltyInfoDto
{

    private final String programKey;

    private final Integer points;

    private LoyaltyInfoDto(Builder builder)
    {
        this.programKey = builder.programKey;
        this.points = builder.points;
    }

    public String getProgramKey()
    {
        return programKey;
    }

    public Integer getPoints()
    {
        return points;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", programKey=").append(programKey)
                        .append(", points=").append(points)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
    {

        private String programKey;
        private Integer points;

        private Builder()
        {
        }

        public Builder withProgramKey(String programKey)
        {
            this.programKey = programKey;
            return this;
        }

        public Builder withPoints(Integer points)
        {
            this.points = points;
            return this;
        }

        public LoyaltyInfoDto build()
        {
            return new LoyaltyInfoDto(this);
        }
    }
}
