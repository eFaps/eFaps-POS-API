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
    private final org.efaps.pos.dto.Currency currency;

    private GenerateDocDto(Builder builder)
    {
        this.items = builder.items;
        this.currency = builder.currency;
    }

    public List<GenerateDocItemDto> getItems()
    {
        return items;
    }

    public org.efaps.pos.dto.Currency getCurrency()
    {
        return currency;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", currency=").append(currency)
                        .append(", items=").append(items)
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
        private org.efaps.pos.dto.Currency currency;

        private Builder()
        {
        }

        public Builder withItems(List<GenerateDocItemDto> items)
        {
            this.items = items;
            return this;
        }

        public Builder withCurrency(org.efaps.pos.dto.Currency currency)
        {
            this.currency = currency;
            return this;
        }

        public GenerateDocDto build()
        {
            return new GenerateDocDto(this);
        }
    }
}
