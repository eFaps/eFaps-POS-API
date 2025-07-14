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

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = StoreStatus.Builder.class)
public class StoreStatus
{

    private final String oid;
    private final boolean existing;
    private final OffsetDateTime modifiedAt;

    private StoreStatus(Builder builder)
    {
        this.oid = builder.oid;
        this.existing = builder.existing;
        this.modifiedAt = builder.modifiedAt;
    }

    public String getOid()
    {
        return oid;
    }

    public boolean isExisting()
    {
        return existing;
    }

    public OffsetDateTime getModifiedAt()
    {
        return modifiedAt;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append("oid=").append(oid)
                        .append(", existing=").append(existing)
                        .append(", modifiedAt=").append(modifiedAt)
                        .toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
    {

        private String oid;
        private boolean existing;
        private OffsetDateTime modifiedAt;

        private Builder()
        {
        }

        public Builder withOid(String oid)
        {
            this.oid = oid;
            return this;
        }

        public Builder withExisting(boolean existing)
        {
            this.existing = existing;
            return this;
        }

        public Builder withModifiedAt(OffsetDateTime modifiedAt)
        {
            this.modifiedAt = modifiedAt;
            return this;
        }

        public StoreStatus build()
        {
            return new StoreStatus(this);
        }
    }

}
