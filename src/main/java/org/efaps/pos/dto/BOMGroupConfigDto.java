/*
 * Copyright 2003 - 2023 The eFaps Team
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

@JsonDeserialize(builder = BOMGroupConfigDto.Builder.class)
public class BOMGroupConfigDto
    extends AbstractObjectDto
{

    private final String productOid;
    private final String name;
    private final String description;
    private final int weight;
    private final int flags;

    private BOMGroupConfigDto(Builder builder)
    {
        super(builder);
        this.productOid = builder.productOid;
        this.name = builder.name;
        this.description = builder.description;
        this.weight = builder.weight;
        this.flags = builder.flags;
    }

    public String getProductOid()
    {
        return productOid;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public int getFlags()
    {
        return flags;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", productOid=").append(productOid)
                        .append(", name=").append(name)
                        .append(", description=").append(description)
                        .append(", flags=").append(flags)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
        extends AbstractObjectDto.Builder<Builder, BOMGroupConfigDto>
    {

        private String productOid;
        private String name;
        private String description;
        private int weight;
        private int flags;

        public Builder withProductOid(String productOid)
        {
            this.productOid = productOid;
            return this;
        }

        public Builder withName(String name)
        {
            this.name = name;
            return this;
        }

        public Builder withDescription(String description)
        {
            this.description = description;
            return this;
        }

        public Builder withFlags(int flags)
        {
            this.flags = flags;
            return this;
        }

        public Builder withWeight(Integer weight)
        {
            this.weight = weight == null ? 0 : weight;
            return this;
        }

        @Override
        public BOMGroupConfigDto build()
        {
            return new BOMGroupConfigDto(this);
        }
    }
}
