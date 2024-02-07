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

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = EmployeeRelationDto.Builder.class)
public class EmployeeRelationDto
{

    private final EmployeeRelationType type;
    private final String employeeOid;

    private EmployeeRelationDto(final Builder builder)
    {
        type = builder.type;
        employeeOid = builder.employeeOid;
    }

    public EmployeeRelationType getType()
    {
        return type;
    }

    public String getEmployeeOid()
    {
        return employeeOid;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", type=").append(type)
                        .append(", employeeOid=").append(employeeOid)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
    {

        private EmployeeRelationType type;
        private String employeeOid;

        private Builder()
        {
        }

        public Builder withType(final EmployeeRelationType type)
        {
            this.type = type;
            return this;
        }

        public Builder withEmployeeOid(final String employeeOid)
        {
            this.employeeOid = employeeOid;
            return this;
        }

        public EmployeeRelationDto build()
        {
            return new EmployeeRelationDto(this);
        }
    }
}
