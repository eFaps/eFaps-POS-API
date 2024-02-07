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

    private final String message;

    private final LogLevel level;

    private final OffsetDateTime createdAt;

    private final Map<String, String> value;

    private LogEntryDto(Builder builder)
    {
        this.ident = builder.ident;
        this.key = builder.key;
        this.message = builder.message;
        this.level = builder.level;
        this.createdAt = builder.createdAt;
        this.value = builder.value;
    }

    public String getIdent()
    {
        return ident;
    }

    public String getKey()
    {
        return key;
    }

    public String getMessage()
    {
        return message;
    }

    public LogLevel getLevel()
    {
        return level;
    }

    public OffsetDateTime getCreatedAt()
    {
        return createdAt;
    }

    public Map<String, String> getValue()
    {
        return value;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", ident=").append(ident)
                        .append(", key=").append(key)
                        .append(", message=").append(message)
                        .append(", level=").append(level)
                        .append(", value=").append(value)
                        .append(", createdAt=").append(createdAt)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
    {

        private String ident;
        private String key;
        private String message;
        private LogLevel level;
        private OffsetDateTime createdAt;
        private Map<String, String> value = Collections.emptyMap();

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

        public Builder withMessage(String message)
        {
            this.message = message;
            return this;
        }

        public Builder withLevel(LogLevel level)
        {
            this.level = level;
            return this;
        }

        public Builder withCreatedAt(OffsetDateTime createdAt)
        {
            this.createdAt = createdAt;
            return this;
        }

        public Builder withValue(Map<String, String> value)
        {
            this.value = value;
            return this;
        }

        public LogEntryDto build()
        {
            return new LogEntryDto(this);
        }
    }
}
