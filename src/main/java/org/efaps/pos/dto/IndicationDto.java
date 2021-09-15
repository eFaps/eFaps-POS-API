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

@JsonDeserialize(builder = IndicationDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class IndicationDto
    extends AbstractObjectDto
{

    private final String value;
    private final String description;
    private final String imageOid;

    protected IndicationDto(final Builder _builder)
    {
        super(_builder);
        value = _builder.value;
        description = _builder.description;
        imageOid = _builder.imageOid;
    }

    public String getValue()
    {
        return value;
    }

    public String getDescription()
    {
        return description;
    }

    public String getImageOid()
    {
        return imageOid;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", value=").append(value)
                        .append(", description=").append(description)
                        .append(", imageOid=").append(imageOid)
                        .append("]").toString();
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
        private String description;
        private String imageOid;

        public Builder withValue(final String _value)
        {
            value = _value;
            return this;
        }

        public Builder withDescription(final String _description)
        {
            description = _description;
            return this;
        }

        public Builder withImageOid(final String _imageOid)
        {
            imageOid = _imageOid;
            return this;
        }

        @Override
        public IndicationDto build()
        {
            return new IndicationDto(this);
        }
    }
}
