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

import java.util.Collection;
import java.util.Collections;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = WorkspaceDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkspaceDto
    extends AbstractObjectDto
{

    private final String name;
    private final String posOid;
    private final Collection<DocType> docTypes;
    private final SpotConfig spotConfig;
    private final int spotCount;
    private final String warehouseOid;
    private final Collection<PrintCmdDto> printCmds;
    private final PosLayout posLayout;
    private final Collection<DiscountDto> discounts;
    private final Collection<CardDto> cards;
    private final PosGridSize gridSize;
    private final Collection<FloorDto> floors;
    private final Collection<String> categoryOids;
    private final int flags;

    public WorkspaceDto(final Builder _builder)
    {
        super(_builder);
        name = _builder.name;
        posOid = _builder.posOid;
        docTypes = _builder.docTypes == null ? Collections.emptySet()
                        : Collections.unmodifiableCollection(_builder.docTypes);
        spotConfig = _builder.spotConfig;
        warehouseOid = _builder.warehouseOid;
        printCmds = _builder.printCmds == null ? Collections.emptySet()
                        : Collections.unmodifiableCollection(_builder.printCmds);
        spotCount = _builder.spotCount;
        posLayout = _builder.posLayout;
        discounts = _builder.discounts == null ? Collections.emptySet()
                        : Collections.unmodifiableCollection(_builder.discounts);
        cards = _builder.cards == null ? Collections.emptySet()
                        : Collections.unmodifiableCollection(_builder.cards);
        gridSize = _builder.gridSize;
        floors = _builder.floors == null ? Collections.emptyList()
                        : Collections.unmodifiableCollection(_builder.floors);
        categoryOids = _builder.categoryOids == null ? Collections.emptyList()
                        : Collections.unmodifiableCollection(_builder.categoryOids);
        flags = _builder.flags;
    }

    public String getName()
    {
        return name;
    }

    public String getPosOid()
    {
        return posOid;
    }

    public Collection<DocType> getDocTypes()
    {
        return docTypes;
    }

    public SpotConfig getSpotConfig()
    {
        return spotConfig;
    }

    public int getSpotCount()
    {
        return spotCount;
    }

    public String getWarehouseOid()
    {
        return warehouseOid;
    }

    public Collection<PrintCmdDto> getPrintCmds()
    {
        return printCmds;
    }

    public PosLayout getPosLayout()
    {
        return posLayout;
    }

    public Collection<DiscountDto> getDiscounts()
    {
        return discounts;
    }

    public Collection<CardDto> getCards()
    {
        return cards;
    }

    public PosGridSize getGridSize()
    {
        return gridSize;
    }

    public Collection<FloorDto> getFloors()
    {
        return floors;
    }

    public Collection<String> getCategoryOids()
    {
        return categoryOids;
    }

    public int getFlags()
    {
        return flags;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", name=").append(name)
                        .append(", posOid=").append(posOid)
                        .append(", docTypes=").append(docTypes)
                        .append(", spotConfig=").append(spotConfig)
                        .append(", spotCount=").append(spotCount)
                        .append(", warehouseOid=").append(warehouseOid)
                        .append(", printCmds=").append(printCmds)
                        .append(", posLayout=").append(posLayout)
                        .append(", discounts=").append(discounts)
                        .append(", cards=").append(cards)
                        .append(", gridSize=").append(gridSize)
                        .append(", floors=").append(floors)
                        .append(", categoryOids=").append(categoryOids)
                        .append(", flags=").append(flags)
                        .append("]").toString();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
        extends AbstractObjectDto.Builder<Builder, WorkspaceDto>
    {

        private String warehouseOid;
        private String name;
        private String posOid;
        private Collection<DocType> docTypes;
        private SpotConfig spotConfig;
        private int spotCount;
        private Collection<PrintCmdDto> printCmds;
        private PosLayout posLayout;
        private Collection<DiscountDto> discounts;
        private Collection<CardDto> cards;
        private PosGridSize gridSize;
        private Collection<FloorDto> floors;
        private Collection<String> categoryOids;
        private int flags;

        public Builder withName(final String _name)
        {
            name = _name;
            return this;
        }

        public Builder withPosOid(final String _posOid)
        {
            posOid = _posOid;
            return this;
        }

        public Builder withDocTypes(final Collection<DocType> _docTypes)
        {
            docTypes = _docTypes;
            return this;
        }

        public Builder withSpotConfig(final SpotConfig _spotConfig)
        {
            spotConfig = _spotConfig;
            return this;
        }

        public Builder withSpotCount(final int _spotCount)
        {
            spotCount = _spotCount;
            return this;
        }

        public Builder withWarehouseOid(final String _warehouseOid)
        {
            warehouseOid = _warehouseOid;
            return this;
        }

        public Builder withPrintCmds(final Collection<PrintCmdDto> _printCmds)
        {
            printCmds = _printCmds;
            return this;
        }

        public Builder withPosLayout(final PosLayout _posLayout)
        {
            posLayout = _posLayout;
            return this;
        }

        public Builder withDiscounts(final Collection<DiscountDto> _discounts)
        {
            discounts = _discounts;
            return this;
        }

        public Builder withCards(final Collection<CardDto> _cards)
        {
            cards = _cards;
            return this;
        }

        public Builder withGridSize(final PosGridSize _gridSize)
        {
            gridSize = _gridSize;
            return this;
        }

        public Builder withFloors(final Collection<FloorDto> _floors)
        {
            floors = _floors;
            return this;
        }

        public Builder withCategoryOids(final Collection<String> _categoryOids)
        {
            categoryOids = _categoryOids;
            return this;
        }

        public Builder withFlags(final int flags)
        {
            this.flags = flags;
            return this;
        }

        @Override
        public WorkspaceDto build()
        {
            return new WorkspaceDto(this);
        }
    }
}
