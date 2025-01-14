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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = SpotDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SpotDto
    extends AbstractObjectDto
{

    private final String label;

    public String getLabel()
    {
        return label;
    }

    private SpotDto(final Builder _builder)
    {
        super(_builder);
        label = _builder.label;
    }
    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", label=").append(label)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder
        extends AbstractObjectDto.Builder<Builder>
    {

        private String label;

        public Builder withLabel(final String _label)
        {
            label = _label;
            return this;
        }


        public SpotDto build()
        {
            return new SpotDto(this);
        }
    }
}
