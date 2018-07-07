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
    private final SpotConfig spotConfig;
    private final int spotCount;
    private final String warehouseOid;
    private final Set<PrintCmdDto> printCmds;
    private final PosLayout posLayout;

    public WorkspaceDto(final Builder _builder)
    {
        super(_builder);
        this.name = _builder.name;
        this.posOid = _builder.posOid;
        this.docTypes = _builder.docTypes == null ? Collections.emptySet()
                        : Collections.unmodifiableSet(_builder.docTypes);
        this.spotConfig = _builder.spotConfig;
        this.warehouseOid = _builder.warehouseOid;
        this.printCmds = _builder.printCmds;
        this.spotCount = _builder.spotCount;
        this.posLayout = _builder.posLayout;
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

    public SpotConfig getSpotConfig()
    {
        return this.spotConfig;
    }

    public int getSpotCount()
    {
        return this.spotCount;
    }

    public String getWarehouseOid()
    {
        return this.warehouseOid;
    }

    public Set<PrintCmdDto> getPrintCmds()
    {
        return this.printCmds;
    }

    public PosLayout getPosLayout()
    {
        return this.posLayout;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
        extends AbstractDto.Builder<Builder, WorkspaceDto>
    {

        public String warehouseOid;
        private String name;
        private String posOid;
        private Set<DocType> docTypes;
        private SpotConfig spotConfig;
        private int spotCount;
        private Set<PrintCmdDto> printCmds;
        private PosLayout posLayout;

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

        public Builder withSpotConfig(final SpotConfig _spotConfig)
        {
            this.spotConfig = _spotConfig;
            return this;
        }

        public Builder withSpotCount(final int _spotCount)
        {
            this.spotCount = _spotCount;
            return this;
        }

        public Builder withWarehouseOid(final String _warehouseOid)
        {
            this.warehouseOid = _warehouseOid;
            return this;
        }

        public Builder withPrintCmds(final Set<PrintCmdDto> _printCmds)
        {
            this.printCmds = _printCmds;
            return this;
        }

        public Builder withPosLayout(final PosLayout _posLayout)
        {
            this.posLayout = _posLayout;
            return this;
        }

        @Override
        public WorkspaceDto build()
        {
            return new WorkspaceDto(this);
        }
    }
}
