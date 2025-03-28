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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = BalanceDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BalanceDto
    extends AbstractObjectDto
{

    private final String id;
    private final String number;
    private final String userOid;
    private final String key;
    private final OffsetDateTime startAt;
    private final OffsetDateTime endAt;
    private final BalanceStatus status;

    private BalanceDto(final Builder _builder)
    {
        super(_builder);
        id = _builder.id;
        number = _builder.number;
        key = _builder.key;
        userOid = _builder.userOid;
        startAt = _builder.startAt;
        endAt = _builder.endAt;
        status = _builder.status;
    }

    public String getId()
    {
        return id;
    }

    public String getNumber()
    {
        return number;
    }

    public String getKey()
    {
        return key;
    }

    public String getUserOid()
    {
        return userOid;
    }

    public OffsetDateTime getStartAt()
    {
        return startAt;
    }

    public OffsetDateTime getEndAt()
    {
        return endAt;
    }

    public BalanceStatus getStatus()
    {
        return status;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", id=").append(id)
                        .append(", number=").append(number)
                        .append(", userOid=").append(userOid)
                        .append(", key=").append(key)
                        .append(", startAt=").append(startAt)
                        .append(", endAt=").append(endAt)
                        .append(", status=").append(status)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
        extends AbstractObjectDto.Builder<Builder>
    {

        private String id;
        private String number;
        private String userOid;
        private String key;
        private OffsetDateTime startAt;
        private OffsetDateTime endAt;
        private BalanceStatus status;

        public Builder withId(final String _id)
        {
            id = _id;
            return this;
        }

        public Builder withNumber(final String _number)
        {
            number = _number;
            return this;
        }

        public Builder withUserOid(final String _userOid)
        {
            userOid = _userOid;
            return this;
        }

        public Builder withKey(final String _key)
        {
            key = _key;
            return this;
        }

        public Builder withStartAt(final OffsetDateTime _startAt)
        {
            startAt = _startAt;
            return this;
        }

        public Builder withEndAt(final OffsetDateTime _endAt)
        {
            endAt = _endAt;
            return this;
        }

        public Builder withStatus(final BalanceStatus _status)
        {
            status = _status;
            return this;
        }

        public BalanceDto build()
        {
            return new BalanceDto(this);
        }
    }
}
