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

@JsonDeserialize(builder = WorkspaceDto.Builder.class)
public class WorkspaceDto
    extends AbstractDto
{
    private final String name;
    private final String posOid;

    public WorkspaceDto(final Builder _builder)
    {
        super(_builder);
        this.name = _builder.name;
        this.posOid = _builder.posOid;
    }

    public String getName()
    {
        return this.name;
    }

    public String getPosOid()
    {
        return this.posOid;
    }

    /**
     * Creates builder to build {@link AgendaDto}.
     *
     * @return created builder
     */
    public static Builder builder()
    {
        return new Builder();
    }

    /**
     * Builder to build {@link AgendaDto}.
     */
    public static final class Builder
        extends AbstractDto.Builder<Builder, WorkspaceDto>
    {
        private String name;
        private String posOid;

        public Builder withName(final String _name)
        {
            this.name = _name;
            return this;
        }

        public Builder withPosOid(final String _posOid)
        {
            this.posOid = _posOid;
            return this;
        }

        @Override
        public WorkspaceDto build()
        {
            return new WorkspaceDto(this);
        }
    }
}