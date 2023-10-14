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

import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = GenerateDocDto.Builder.class)
public class GenerateDocDto
{

    private final List<GenerateDocItemDto> items;
    private final Currency currency;
    private final String contactOid;

    private GenerateDocDto(Builder builder)
    {
        this.items = builder.items;
        this.currency = builder.currency;
        this.contactOid = builder.contactOid;
    }

    public List<GenerateDocItemDto> getItems()
    {
        return items;
    }

    public Currency getCurrency()
    {
        return currency;
    }

    public String getContactOid()
    {
        return contactOid;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", currency=").append(currency)
                        .append(", items=").append(items)
                        .append(", contactOid=").append(contactOid)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
    {

        private List<GenerateDocItemDto> items = Collections.emptyList();
        private Currency currency;
        private String contactOid;

        private Builder()
        {
        }

        public Builder withItems(List<GenerateDocItemDto> items)
        {
            this.items = items;
            return this;
        }

        public Builder withCurrency(Currency currency)
        {
            this.currency = currency;
            return this;
        }

        public Builder withContactOid(String contactOid)
        {
            this.contactOid = contactOid;
            return this;
        }

        public GenerateDocDto build()
        {
            return new GenerateDocDto(this);
        }
    }
}
