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

import java.util.Collection;
import java.util.Collections;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = IndicationSetDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class IndicationSetDto
    extends AbstractObjectDto
{

    private final String name;

    private final String description;

    private final boolean required;

    private final boolean multiple;

    private final String imageOid;

    private final Collection<IndicationDto> indications;

    protected IndicationSetDto(final Builder _builder)
    {
        super(_builder);
        name = _builder.name;
        description = _builder.description;
        indications = _builder.indications == null ? Collections.emptySet()
                        : Collections.unmodifiableCollection(_builder.indications);
        required = _builder.required;
        multiple = _builder.multiple;
        imageOid = _builder.imageOid;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public boolean isRequired()
    {
        return required;
    }

    public boolean isMultiple()
    {
        return multiple;
    }

    public String getImageOid()
    {
        return imageOid;
    }

    public Collection<IndicationDto> getIndications()
    {
        return indications;
    }

    @Override
    public String toString()
    {
         return new StringBuilder()
                        .append(super.toString())
                        .append(", name=").append(name)
                        .append(", description=").append(description)
                        .append(", required=").append(required)
                        .append(", multiple=").append(multiple)
                        .append(", imageOid=").append(imageOid)
                        .append(", indications=").append(indications)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
        extends AbstractObjectDto.Builder<Builder, IndicationSetDto>
    {

        private String name;
        private String description;
        private Collection<IndicationDto> indications;
        private boolean required;
        private boolean multiple;
        private String imageOid;

        public Builder withName(final String _name)
        {
            name = _name;
            return this;
        }

        public Builder withDescription(final String _description)
        {
            description = _description;
            return this;
        }

        public Builder withIndications(final Collection<IndicationDto> _indications)
        {
            indications = _indications;
            return this;
        }

        public Builder withRequired(final Boolean _required)
        {
            required = _required == null ? false : _required;
            return this;
        }

        public Builder withMultiple(final Boolean _multiple)
        {
            multiple = _multiple == null ? false : _multiple;
            return this;
        }

        public Builder withImageOid(final String _imageOid)
        {
            imageOid = _imageOid;
            return this;
        }

        @Override
        public IndicationSetDto build()
        {
            return new IndicationSetDto(this);
        }
    }
}
