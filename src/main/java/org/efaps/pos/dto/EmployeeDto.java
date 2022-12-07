/*
 * Copyright 2003 - 2022 The eFaps Team
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

@JsonDeserialize(builder = EmployeeDto.Builder.class)
public class EmployeeDto
    extends AbstractObjectDto
{

    private final String firstName;
    private final String surName;

    private EmployeeDto(final Builder builder)
    {
        super(builder);
        firstName = builder.firstName;
        surName = builder.surName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getSurName()
    {
        return surName;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", firstName=").append(firstName)
                        .append(", surName=").append(surName)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
        extends AbstractObjectDto.Builder<Builder, EmployeeDto>
    {

        private String firstName;
        private String surName;

        private Builder()
        {
        }

        public Builder withFirstName(final String firstName)
        {
            this.firstName = firstName;
            return this;
        }

        public Builder withSurName(final String surName)
        {
            this.surName = surName;
            return this;
        }

        @Override
        public EmployeeDto build()
        {
            return new EmployeeDto(this);
        }
    }
}
