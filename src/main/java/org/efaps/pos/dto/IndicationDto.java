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

@JsonDeserialize(builder = IndicationDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class IndicationDto
    extends AbstractObjectDto
{

    private final String value;
    private final String description;
    private final String imageOid;
    private final boolean defaultSelected;
    private final int weight;

    protected IndicationDto(final Builder builder)
    {
        super(builder);
        value = builder.value;
        description = builder.description;
        imageOid = builder.imageOid;
        defaultSelected = builder.defaultSelected;
        weight = builder.weight;
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

    public boolean isDefaultSelected()
    {
        return defaultSelected;
    }

    public int getWeight()
    {
        return weight;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", value=").append(value)
                        .append(", description=").append(description)
                        .append(", imageOid=").append(imageOid)
                        .append(", defaultSelected=").append(defaultSelected)
                        .append(", weight=").append(weight)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
        extends AbstractObjectDto.Builder<Builder>
    {

        private String value;
        private String description;
        private String imageOid;
        private boolean defaultSelected;
        private int weight;

        public Builder withValue(final String value)
        {
            this.value = value;
            return this;
        }

        public Builder withDescription(final String description)
        {
            this.description = description;
            return this;
        }

        public Builder withImageOid(final String imageOid)
        {
            this.imageOid = imageOid;
            return this;
        }

        public Builder withDefaultSelected(final boolean defaultSelected)
        {
            this.defaultSelected = defaultSelected;
            return this;
        }

        public Builder withWeight(final int weight)
        {
            this.weight = weight;
            return this;
        }

        public IndicationDto build()
        {
            return new IndicationDto(this);
        }
    }
}
