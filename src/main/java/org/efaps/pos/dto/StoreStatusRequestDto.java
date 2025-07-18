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

import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = StoreStatusRequestDto.Builder.class)
public class StoreStatusRequestDto
{

    private final List<String> oids;

    private StoreStatusRequestDto(Builder builder)
    {
        this.oids = builder.oids;
    }

    public List<String> getOids()
    {
        return oids;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append("oids=").append(oids)
                        .toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
    {

        private List<String> oids = Collections.emptyList();

        private Builder()
        {
        }

        public Builder withOids(List<String> oids)
        {
            this.oids = oids;
            return this;
        }

        public StoreStatusRequestDto build()
        {
            return new StoreStatusRequestDto(this);
        }
    }
}
