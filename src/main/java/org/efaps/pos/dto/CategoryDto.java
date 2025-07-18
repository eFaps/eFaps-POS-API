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

@JsonDeserialize(builder = CategoryDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryDto
    extends AbstractObjectDto
{

    private final String name;

    private final String description;

    private final String label;

    private final int weight;

    private final String imageOid;

    private final String parentOid;

    public CategoryDto(final Builder builder)
    {
        super(builder);
        name = builder.name;
        description = builder.description;
        label = builder.label;
        weight = builder.weight;
        imageOid = builder.imageOid;
        parentOid = builder.parentOid;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public String getLabel()
    {
        return label;
    }

    public int getWeight()
    {
        return weight;
    }

    public String getImageOid()
    {
        return imageOid;
    }

    public String getParentOid()
    {
        return parentOid;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", name=").append(name)
                        .append(", description=").append(description)
                        .append(", label=").append(label)
                        .append(", weight=").append(weight)
                        .append(", imageOid=").append(imageOid)
                        .append(", parentOid=").append(parentOid)
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

        private String name;
        private String description;
        private String label;
        private int weight = 0;
        private String imageOid;
        private String parentOid;

        public Builder withName(final String _name)
        {
            name = _name;
            return this;
        }

        public Builder withDescription(final String description)
        {
            this.description = description;
            return this;
        }

        public Builder withLabel(final String label)
        {
            this.label = label;
            return this;
        }

        public Builder withWeight(final int _weight)
        {
            weight = _weight;
            return this;
        }

        public Builder withImageOid(final String _imageOid)
        {
            imageOid = _imageOid;
            return this;
        }

        public Builder withParentOid(final String _parentOid)
        {
            parentOid = _parentOid;
            return this;
        }

        public CategoryDto build()
        {
            return new CategoryDto(this);
        }
    }
}
