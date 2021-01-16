/*
 * Copyright 2003 - 2020 The eFaps Team
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

    private final Set<IndicationDto> indications;

    private final boolean required;

    protected IndicationSetDto(final Builder _builder)
    {
        super(_builder);
        name = _builder.name;
        indications = _builder.indications == null ? Collections.emptySet()
                        : Collections.unmodifiableSet(_builder.indications);
        required = _builder.required;
    }

    public String getName()
    {
        return name;
    }

    public Set<IndicationDto> getIndications()
    {
        return indications;
    }

    public boolean isRequired()
    {
        return required;
    }

    @Override
    public String toString()
    {
        final StringBuilder builder2 = new StringBuilder();
        builder2.append("IndicationSetDto [name=").append(name).append(", indications=").append(indications)
                        .append(", required=").append(required).append("]");
        return builder2.toString();
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
        private Set<IndicationDto> indications;
        private boolean required;

        public Builder withName(final String _name)
        {
            name = _name;
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

        @Override
        public IndicationSetDto build()
        {
            return new IndicationSetDto(this);
        }
    }
}
