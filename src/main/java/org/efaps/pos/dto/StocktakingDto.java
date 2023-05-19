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

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = StocktakingDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class StocktakingDto
    extends AbstractObjectDto
{
    private final String number;
    private final String userOid;
    private final OffsetDateTime startAt;
    private final OffsetDateTime endAt;
    private final StocktakingStatus status;
    private final List<StocktakingEntryDto> entries;

    private StocktakingDto(final Builder builder)
    {
        super(builder);
        this.number = builder.number;
        this.userOid = builder.userOid;
        this.startAt = builder.startAt;
        this.endAt = builder.endAt;
        this.status = builder.status;
        this.entries = builder.entries;
    }

    public String getNumber()
    {
        return number;
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

    public StocktakingStatus getStatus()
    {
        return status;
    }

    public List<StocktakingEntryDto> getEntries()
    {
        return entries;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", number=").append(number)
                        .append(", userOid=").append(userOid)
                        .append(", startAt=").append(startAt)
                        .append(", endAt=").append(endAt)
                        .append(", status=").append(status)
                        .append(", userOid=").append(entries)
                        .toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
        extends AbstractObjectDto.Builder<Builder, StocktakingDto>
    {

        private String number;
        private String userOid;
        private OffsetDateTime startAt;
        private OffsetDateTime endAt;
        private StocktakingStatus status;
        private List<StocktakingEntryDto> entries = Collections.emptyList();

        private Builder()
        {
        }

        public Builder withNumber(String number)
        {
            this.number = number;
            return this;
        }

        public Builder withUserOid(String userOid)
        {
            this.userOid = userOid;
            return this;
        }

        public Builder withStartAt(OffsetDateTime startAt)
        {
            this.startAt = startAt;
            return this;
        }

        public Builder withEndAt(OffsetDateTime endAt)
        {
            this.endAt = endAt;
            return this;
        }

        public Builder withStatus(StocktakingStatus status)
        {
            this.status = status;
            return this;
        }

        public Builder withEntries(List<StocktakingEntryDto> entries)
        {
            this.entries = entries;
            return this;
        }

        @Override
        public StocktakingDto build()
        {
            return new StocktakingDto(this);
        }
    }

}
