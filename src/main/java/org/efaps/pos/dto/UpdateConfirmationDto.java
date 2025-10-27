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

@JsonDeserialize(builder = UpdateConfirmationDto.Builder.class)
public class UpdateConfirmationDto
{

    private final String version;

    public String getVersion()
    {
        return version;
    }

    public UpdateStatus getStatus()
    {
        return status;
    }

    private final UpdateStatus status;

    private UpdateConfirmationDto(Builder builder)
    {
        this.version = builder.version;
        this.status = builder.status;
    }

    @Override
    public String toString()
    {
        return new StringBuilder().append(this.getClass().getName())
                        .append(" [version=").append(version)
                        .append(", status=").append(status)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
    {

        private String version;
        private UpdateStatus status;

        private Builder()
        {
        }

        public Builder withVersion(String version)
        {
            this.version = version;
            return this;
        }

        public Builder withStatus(UpdateStatus status)
        {
            this.status = status;
            return this;
        }

        public UpdateConfirmationDto build()
        {
            return new UpdateConfirmationDto(this);
        }
    }
}
