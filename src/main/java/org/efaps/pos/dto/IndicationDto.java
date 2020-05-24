/*
 * Copyright 2003 - 2019 The eFaps Team
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

@JsonDeserialize(builder = IndicationDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class IndicationDto
    extends AbstractObjectDto
{

    private final String value;

    protected IndicationDto(final Builder _builder)
    {
        super(_builder);
        value = _builder.value;
    }

    public String getValue()
    {
        return value;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
        extends AbstractObjectDto.Builder<Builder, IndicationDto>
    {

        private String value;

        public Builder withValue(final String _value)
        {
            value = _value;
            return this;
        }

        @Override
        public IndicationDto build()
        {
            return new IndicationDto(this);
        }
    }
}
