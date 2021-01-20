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

import java.util.Collections;
import java.util.Set;

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

    private final Set<IndicationDto> indications;

    protected IndicationSetDto(final Builder _builder)
    {
        super(_builder);
        name = _builder.name;
        description = _builder.description;
        indications = _builder.indications == null ? Collections.emptySet()
                        : Collections.unmodifiableSet(_builder.indications);
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

    public Set<IndicationDto> getIndications()
    {
        return indications;
    }

    @Override
    public String toString()
    {
        return "IndicationSetDto [name=" + name + ", description=" + description + ", required=" + required
                        + ", multiple=" + multiple + ", imageOid=" + imageOid + ", indications=" + indications + "]";
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
        private Set<IndicationDto> indications;
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

        public Builder withIndications(final Set<IndicationDto> _indications)
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
