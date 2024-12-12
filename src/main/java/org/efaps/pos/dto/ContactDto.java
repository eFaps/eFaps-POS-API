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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = ContactDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContactDto
    extends AbstractObjectDto
{

    private final String id;
    private final String name;
    private final IdentificationType idType;
    private final String idNumber;
    private final String email;
    private final String firstName;
    private final String lastName;

    private ContactDto(final Builder builder)
    {
        super(builder);
        id = builder.id;
        name = builder.name;
        idType = builder.idType;
        idNumber = builder.idNumber;
        email = builder.email;
        firstName = builder.firstName;
        lastName = builder.lastName;
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public IdentificationType getIdType()
    {
        return idType;
    }

    public String getIdNumber()
    {
        return idNumber;
    }

    public String getEmail()
    {
        return email;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", id=").append(id)
                        .append(", name=").append(name)
                        .append(", idType=").append(idType)
                        .append(", idNumber=").append(idNumber)
                        .append(", email=").append(email)
                        .append(", firstName=").append(firstName)
                        .append(", lastName=").append(lastName)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
        extends AbstractObjectDto.Builder<Builder, ContactDto>
    {

        private String id;
        private String name;
        private IdentificationType idType;
        private String idNumber;
        private String email;
        private String firstName;
        private String lastName;

        public Builder withId(final String _id)
        {
            id = _id;
            return this;
        }

        public Builder withName(final String _name)
        {
            name = _name;
            return this;
        }

        public Builder withIdType(final IdentificationType _idType)
        {
            idType = _idType;
            return this;
        }

        public Builder withIdNumber(final String _idNumber)
        {
            idNumber = _idNumber;
            return this;
        }

        public Builder withEmail(final String _email)
        {
            email = _email;
            return this;
        }

        public Builder withFirstName(final String firstName)
        {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(final String lastName)
        {
            this.lastName = lastName;
            return this;
        }

        @Override
        public ContactDto build()
        {
            return new ContactDto(this);
        }
    }
}
