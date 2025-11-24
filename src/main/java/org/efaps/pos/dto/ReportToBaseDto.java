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

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = ReportToBaseDto.Builder.class)
public class ReportToBaseDto
{

    private final String version;
    private final String instalationId;
    private final OffsetDateTime createdAt;
    private final Map<String, Object> details;

    @Generated("SparkTools")
    private ReportToBaseDto(Builder builder)
    {
        this.version = builder.version;
        this.instalationId = builder.instalationId;
        this.createdAt = builder.createdAt;
        this.details = builder.details;
    }

    public String getVersion()
    {
        return version;
    }

    public String getInstalationId()
    {
        return instalationId;
    }

    public OffsetDateTime getCreatedAt()
    {
        return createdAt;
    }

    public Map<String, Object> getDetails()
    {
        return details;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", version=").append(version)
                        .append(", instalationId=").append(instalationId)
                        .append(", createdAt=").append(createdAt)
                        .append(", details=").append(details)
                        .append("]").toString();
    }

    @Generated("SparkTools")
    public static Builder builder()
    {
        return new Builder();
    }

    @Generated("SparkTools")
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
    {

        private String version;
        private String instalationId;
        private OffsetDateTime createdAt;
        private Map<String, Object> details = Collections.emptyMap();

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

        public Builder withCreatedAt(OffsetDateTime createdAt)
        {
            this.createdAt = createdAt;
            return this;
        }

        public Builder withDetails(Map<String, Object> details)
        {
            this.details = details;
            return this;
        }

        public ReportToBaseDto build()
        {
            return new ReportToBaseDto(this);
        }
    }
}
