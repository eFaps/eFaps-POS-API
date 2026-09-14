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

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = FileDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FileDto
    extends AbstractObjectDto
{

    private final String name;
    private final String description;
    private final String fileName;
    private final Map<String, String> tags;
    private final List<FileProductEntryDto> products;

    protected FileDto(final Builder builder)
    {
        super(builder);
        this.name = builder.name;
        this.description = builder.description;
        this.fileName = builder.fileName;
        this.tags = builder.tags;
        this.products = builder.products;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public String getFileName()
    {
        return fileName;
    }

    public Map<String, String> getTags()
    {
        return tags;
    }

    public List<FileProductEntryDto> getProducts()
    {
        return products;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", name=").append(name)
                        .append(", description=").append(description)
                        .append(", tags=").append(tags)
                        .append(", products=").append(products)
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

        private String name;
        private String description;
        private String fileName;
        private Map<String, String> tags;
        private List<FileProductEntryDto> products;

        public Builder withName(final String name)
        {
            this.name = name;
            return this;
        }

        public Builder withDescription(final String description)
        {
            this.description = description;
            return this;
        }

        public Builder withFileName(final String fileName)
        {
            this.fileName = fileName;
            return this;
        }

        public Builder withTags(final Map<String, String> tags)
        {
            this.tags = tags;
            return this;
        }

        public Builder withProducts(List<FileProductEntryDto> products)
        {
            this.products = products;
            return this;
        }

        public FileDto build()
        {
            return new FileDto(this);
        }
    }
}
