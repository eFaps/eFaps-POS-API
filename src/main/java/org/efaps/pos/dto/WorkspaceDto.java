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

import java.util.Collections;
import java.util.Set;

@JsonDeserialize(builder = WorkspaceDto.Builder.class)
public class WorkspaceDto
    extends AbstractDto
{

    private final String name;
    private final String posOid;
    private final Set<DocType> docTypes;

    public WorkspaceDto(final Builder _builder)
    {
        super(_builder);
        this.name = _builder.name;
        this.posOid = _builder.posOid;
        this.docTypes = _builder.docTypes == null ? Collections.emptySet()
                        : Collections.unmodifiableSet(_builder.docTypes);
    }

    public String getName()
    {
        return this.name;
    }

    public String getPosOid()
    {
        return this.posOid;
    }

    public Set<DocType> getDocTypes()
    {
        return this.docTypes;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
        extends AbstractDto.Builder<Builder, WorkspaceDto>
    {

        private String name;
        private String posOid;
        private Set<DocType> docTypes;

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

        public Builder withDocTypes(final Set<DocType> _docTypes)
        {
            this.docTypes = _docTypes;
            return this;
        }

        @Override
        public WorkspaceDto build()
        {
            return new WorkspaceDto(this);
        }
    }
}
