/*
 * Copyright 2003 - 2018 The eFaps Team
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

import java.time.LocalDate;

@JsonDeserialize(builder = BalanceDto.Builder.class)
public class BalanceDto
    extends AbstractDto
{

    private final String id;
    private final String number;
    private final String userOid;
    private final LocalDate startAt;
    private final LocalDate endAt;
    private final BalanceStatus status;

    private BalanceDto(final Builder _builder)
    {
        super(_builder);
        this.id = _builder.id;
        this.number = _builder.number;
        this.userOid = _builder.userOid;
        this.startAt = _builder.startAt;
        this.endAt = _builder.endAt;
        this.status = _builder.status;
    }

    public String getId()
    {
        return this.id;
    }

    public String getNumber()
    {
        return this.number;
    }

    public String getUserOid()
    {
        return this.userOid;
    }

    public LocalDate getStartAt()
    {
        return this.startAt;
    }

    public LocalDate getEndAt()
    {
        return this.endAt;
    }

    public BalanceStatus getStatus()
    {
        return this.status;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
        extends AbstractDto.Builder<Builder, BalanceDto>
    {

        private String id;
        private String number;
        private String userOid;
        private LocalDate startAt;
        private LocalDate endAt;
        private BalanceStatus status;

        public Builder withId(final String _id)
        {
            this.id = _id;
            return this;
        }

        public Builder withNumber(final String _number)
        {
            this.number = _number;
            return this;
        }

        public Builder withUserOid(final String _userOid)
        {
            this.userOid = _userOid;
            return this;
        }

        public Builder withStartAt(final LocalDate _startAt)
        {
            this.startAt = _startAt;
            return this;
        }

        public Builder withEndAt(final LocalDate _endAt)
        {
            this.endAt = _endAt;
            return this;
        }

        public Builder withStatus(final BalanceStatus _status)
        {
            this.status = _status;
            return this;
        }

        @Override
        public BalanceDto build()
        {
            return new BalanceDto(this);
        }
    }
}
