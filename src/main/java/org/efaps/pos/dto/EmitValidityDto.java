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

import tools.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = EmitValidityDto.Builder.class)
public class EmitValidityDto
{
    private final String sourceOid;

    private EmitValidityDto(Builder builder)
    {
        this.sourceOid = builder.sourceOid;
    }

    public String getSourceOid()
    {
        return sourceOid;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append("EmitValidityDto [sourceOid=").append(sourceOid)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
    {

        private String sourceOid;

        private Builder()
        {
        }

        public Builder withSourceOid(String sourceOid)
        {
            this.sourceOid = sourceOid;
            return this;
        }

        public EmitValidityDto build()
        {
            return new EmitValidityDto(this);
        }
    }
}
