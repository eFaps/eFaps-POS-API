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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = CategoryDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryDto
    extends AbstractObjectDto
{

    private final String name;

    private final int weight;

    private final String imageOid;

    public CategoryDto(final Builder _builder)
    {
        super(_builder);
        name = _builder.name;
        weight = _builder.weight;
        imageOid = _builder.imageOid;
    }

    public String getName()
    {
        return name;
    }

    public int getWeight()
    {
        return weight;
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
                        .append(", name=").append(name)
                        .append(", weight=").append(weight)
                        .append(", imageOid=").append(imageOid)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
        extends AbstractObjectDto.Builder<Builder, CategoryDto>
    {

        private String name;
        private int weight = 0;
        private String imageOid;

        public Builder withName(final String _name)
        {
            name = _name;
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

        @Override
        public CategoryDto build()
        {
            return new CategoryDto(this);
        }
    }
}
