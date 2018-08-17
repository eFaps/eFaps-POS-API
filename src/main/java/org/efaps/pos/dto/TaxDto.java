/*
 * Copyright 2003 - 2018 The eFaps Team
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

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.math.BigDecimal;

@JsonDeserialize(builder = TaxDto.Builder.class)
public class TaxDto
    extends AbstractObjectDto
{
    private final String key;
    private final String name;
    private final BigDecimal percent;

    private TaxDto(final Builder _builder)
    {
        super(_builder);
        this.key = _builder.key;
        this.name = _builder.name;
        this.percent = _builder.percent;
    }

    public String getKey()
    {
        return this.key;
    }

    public String getName()
    {
        return this.name;
    }

    public BigDecimal getPercent()
    {
        return this.percent;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
        extends AbstractObjectDto.Builder<Builder, TaxDto>
    {
        private String key;
        private String name;
        private BigDecimal percent;

        public Builder withKey(final String _key)
        {
            this.key = _key;
            return this;
        }

        public Builder withName(final String _name)
        {
            this.name = _name;
            return this;
        }

        public Builder withPercent(final BigDecimal _percent)
        {
            this.percent = _percent;
            return this;
        }

        @Override
        public TaxDto build()
        {
            return new TaxDto(this);
        }
    }
}
