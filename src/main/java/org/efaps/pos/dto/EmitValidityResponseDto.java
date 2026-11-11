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

@JsonDeserialize(builder = EmitValidityResponseDto.Builder.class)
public class EmitValidityResponseDto
{
    private final boolean valid;
    private final String message;

    private EmitValidityResponseDto(Builder builder)
    {
        this.valid = builder.valid;
        this.message = builder.message;
    }

    public boolean isValid()
    {
        return valid;
    }

    public String getMessage()
    {
        return message;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append("EmitValidityResponseDto [valid=").append(valid)
                        .append(", message=").append(message)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
    {

        private boolean valid;
        private String message;

        private Builder()
        {
        }

        public Builder withValid(boolean valid)
        {
            this.valid = valid;
            return this;
        }

        public Builder withMessage(String message)
        {
            this.message = message;
            return this;
        }

        public EmitValidityResponseDto build()
        {
            return new EmitValidityResponseDto(this);
        }
    }
}
