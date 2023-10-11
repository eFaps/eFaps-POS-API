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

import java.util.Collection;
import java.util.Collections;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = CalculationDto.Builder.class)
public class CalculationDto
{

    private final Collection<CalculationItemDto> items;

    private CalculationDto(final Builder builder)
    {
        this.items = builder.items;
    }

    public Collection<CalculationItemDto> getItems()
    {
        return items;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append("CalculationDto [items=").append(items)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
    {

        private Collection<CalculationItemDto> items = Collections.emptyList();

        private Builder()
        {
        }

        public Builder withItems(Collection<CalculationItemDto> items)
        {
            this.items = items;
            return this;
        }

        public CalculationDto build()
        {
            return new CalculationDto(this);
        }
    }
}
