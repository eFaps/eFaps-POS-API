/*
 * Copyright 2003 - 2023 The eFaps Team
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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = ReportToBaseDto.Builder.class)
public class ReportToBaseDto
{

    private final String version;
    private final String instalationId;

    private ReportToBaseDto(Builder builder)
    {
        this.version = builder.version;
        this.instalationId = builder.instalationId;
    }

    public String getVersion()
    {
        return version;
    }

    public String getInstalationId()
    {
        return instalationId;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", version=").append(version)
                        .append(", instalationId=").append(instalationId)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
    {

        private String version;
        private String instalationId;

        private Builder()
        {
        }

        public Builder withVersion(String version)
        {
            this.version = version;
            return this;
        }

        public Builder withInstalationId(String instalationId)
        {
            this.instalationId = instalationId;
            return this;
        }

        public ReportToBaseDto build()
        {
            return new ReportToBaseDto(this);
        }
    }
}
