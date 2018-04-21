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

@JsonDeserialize(builder = PosDto.Builder.class)
public class PosDto
    extends AbstractDto
{

    private final String name;

    private final String currency;

    private final CompanyDto company;

    private final String defaultContactOid;

    public PosDto(final Builder _builder)
    {
        super(_builder);
        this.name = _builder.name;
        this.currency = _builder.currency;
        this.company = _builder.company;
        this.defaultContactOid = _builder.defaultContactOid;
    }

    public String getName()
    {
        return this.name;
    }

    public String getCurrency()
    {
        return this.currency;
    }

    public CompanyDto getCompany()
    {
        return this.company;
    }

    public String getDefaultContactOid()
    {
        return this.defaultContactOid;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
        extends AbstractDto.Builder<Builder, PosDto>
    {

        private String name;
        private String currency;
        private CompanyDto company;
        private String defaultContactOid;

        public Builder withName(final String _name)
        {
            this.name = _name;
            return this;
        }

        public Builder withCurrency(final String _currency)
        {
            this.currency = _currency;
            return this;
        }

        public Builder withCompany(final CompanyDto _company)
        {
            this.company = _company;
            return this;
        }

        public Builder withDefaultContactOid(final String _defaultContactOid)
        {
            this.defaultContactOid = _defaultContactOid;
            return this;
        }

        @Override
        public PosDto build()
        {
            return new PosDto(this);
        }
    }
}
