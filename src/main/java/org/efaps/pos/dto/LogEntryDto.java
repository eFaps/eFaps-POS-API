package org.efaps.pos.dto;

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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = LogEntryDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LogEntryDto
{

    private final String ident;

    private final String key;

    private final String value;

    private final LogLevel level;

    private LogEntryDto(Builder builder)
    {
        this.ident = builder.ident;
        this.key = builder.key;
        this.value = builder.value;
        this.level = builder.level;
    }

    public String getIdent()
    {
        return ident;
    }

    public String getKey()
    {
        return key;
    }

    public String getValue()
    {
        return value;
    }

    public LogLevel getLevel()
    {
        return level;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", ident=").append(ident)
                        .append(", key=").append(key)
                        .append(", value=").append(value)
                        .append(", level=").append(level)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
    {

        private String ident;
        private String key;
        private String value;
        private LogLevel level;

        private Builder()
        {
        }

        public Builder withIdent(String ident)
        {
            this.ident = ident;
            return this;
        }

        public Builder withKey(String key)
        {
            this.key = key;
            return this;
        }

        public Builder withValue(String value)
        {
            this.value = value;
            return this;
        }

        public Builder withLevel(LogLevel level)
        {
            this.level = level;
            return this;
        }

        public LogEntryDto build()
        {
            return new LogEntryDto(this);
        }
    }
}
