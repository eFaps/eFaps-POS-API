/*
 * Copyright 2003 - 2021 The eFaps Team
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
 *
 */
package org.efaps.pos.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = BarcodeDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BarcodeDto
{

    private final String type;
    private final String code;

    private BarcodeDto(final Builder builder)
    {
        type = builder.type;
        code = builder.code;
    }

    public String getType()
    {
        return type;
    }

    public String getCode()
    {
        return code;
    }

    @Override
    public String toString()
    {
        return new StringBuilder().append("BarcodeDto [type=").append(type)
                        .append(", code=").append(code).append("]").toString();
    }

    /**
     * Creates builder to build {@link BarcodeDto}.
     *
     * @return created builder
     */
    public static Builder builder()
    {
        return new Builder();
    }

    /**
     * Builder to build {@link BarcodeDto}.
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
    {

        private String type;
        private String code;

        private Builder()
        {
        }

        public Builder withType(final String type)
        {
            this.type = type;
            return this;
        }

        public Builder withCode(final String code)
        {
            this.code = code;
            return this;
        }

        public BarcodeDto build()
        {
            return new BarcodeDto(this);
        }
    }
}
