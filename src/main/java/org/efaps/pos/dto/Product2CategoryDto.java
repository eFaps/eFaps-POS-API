/*
 * Copyright 2003 - 2022 The eFaps Team
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

@JsonDeserialize(builder = ProductRelationDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product2CategoryDto
{

    private final String categoryOid;
    private final int weight;

    protected Product2CategoryDto(final Builder _builder)
    {
        categoryOid = _builder.categoryOid;
        weight = _builder.weight;
    }

    public String getCategoryOid()
    {
        return categoryOid;
    }

    public int getWeight()
    {
        return weight;
    }

    @Override
    public String toString()
    {
        final StringBuilder builder2 = new StringBuilder();
        builder2.append("Product2CategoryDto [categoryOid=").append(categoryOid)
                        .append(", weight=").append(weight)
                        .append("]");
        return builder2.toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
    {

        private String categoryOid;
        private int weight;

        public Builder withCategoryOid(final String _categoryOid)
        {
            categoryOid = _categoryOid;
            return this;
        }

        public Builder withWeight(final int _weight)
        {
            weight = _weight;
            return this;
        }

        public Product2CategoryDto build()
        {
            return new Product2CategoryDto(this);
        }
    }
}
