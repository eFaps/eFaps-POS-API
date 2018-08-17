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
    extends AbstractObjectDto
{
    private final String id;
    private final String name;
    private final IdentificationType idType;
    private final String idNumber;

    private ContactDto(final Builder _builder)
    {
        super(_builder);
        this.id = _builder.id;
        this.name = _builder.name;
        this.idType = _builder.idType;
        this.idNumber = _builder.idNumber;
    }

    public String getId()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public IdentificationType getIdType()
    {
        return this.idType;
    }

    public String getIdNumber()
    {
        return this.idNumber;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
        extends AbstractObjectDto.Builder<Builder, ContactDto>
    {
        private String id;
        private String name;
        private IdentificationType idType;
        private String idNumber;

        public Builder withId(final String _id)
        {
            this.id = _id;
            return this;
        }

        public Builder withName(final String _name)
        {
            this.name = _name;
            return this;
        }

        public Builder withIdType(final IdentificationType _idType)
        {
            this.idType = _idType;
            return this;
        }

        public Builder withIdNumber(final String _idNumber)
        {
            this.idNumber = _idNumber;
            return this;
        }

        @Override
        public ContactDto build()
        {
            return new ContactDto(this);
        }
    }
}
