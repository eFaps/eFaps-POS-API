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

@JsonDeserialize(builder = ContactDto.Builder.class)
public class ContactDto
    extends AbstractDto
{

    private final String name;
    private final String taxNumber;

    private ContactDto(final Builder _builder)
    {
        super(_builder);
        this.name = _builder.name;
        this.taxNumber = _builder.taxNumber;
    }

    public String getName()
    {
        return this.name;
    }

    public String getTaxNumber()
    {
        return this.taxNumber;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
        extends AbstractDto.Builder<Builder, ContactDto>
    {

        private String name;
        private String taxNumber;

        public Builder withName(final String _name)
        {
            this.name = _name;
            return this;
        }

        public Builder withTaxNumber(final String _taxNumber)
        {
            this.taxNumber = _taxNumber;
            return this;
        }

        @Override
        public ContactDto build()
        {
            return new ContactDto(this);
        }
    }
}
