/*
 * Copyright 2003 - 2020 The eFaps Team
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

import java.util.Collections;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = WorkspaceDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkspaceDto
    extends AbstractObjectDto
{

    private final String name;
    private final String posOid;
    private final Set<DocType> docTypes;
    private final SpotConfig spotConfig;
    private final int spotCount;
    private final String warehouseOid;
    private final Set<PrintCmdDto> printCmds;
    private final PosLayout posLayout;
    private final Set<DiscountDto> discounts;
    private final Set<CardDto> cards;
    private final PosGridSize gridSize;
    private final boolean gridShowPrice;
    private final List<FloorDto> floors;
    private final List<String> categoryOids;

    public WorkspaceDto(final Builder _builder)
    {
        super(_builder);
        name = _builder.name;
        posOid = _builder.posOid;
        docTypes = _builder.docTypes == null ? Collections.emptySet()
                        : Collections.unmodifiableSet(_builder.docTypes);
        spotConfig = _builder.spotConfig;
        warehouseOid = _builder.warehouseOid;
        printCmds = _builder.printCmds == null ? Collections.emptySet()
                        : Collections.unmodifiableSet(_builder.printCmds);
        spotCount = _builder.spotCount;
        posLayout = _builder.posLayout;
        discounts = _builder.discounts == null ? Collections.emptySet()
                        : Collections.unmodifiableSet(_builder.discounts);
        cards = _builder.cards == null ? Collections.emptySet()
                        : Collections.unmodifiableSet(_builder.cards);
        gridSize = _builder.gridSize;
        gridShowPrice = _builder.gridShowPrice;
        floors = _builder.floors == null ? Collections.emptyList()
                        : Collections.unmodifiableList(_builder.floors);
        categoryOids = _builder.categoryOids == null ? Collections.emptyList()
                        : Collections.unmodifiableList(_builder.categoryOids);
    }

    public String getName()
    {
        return name;
    }

    public String getPosOid()
    {
        return posOid;
    }

    public Set<DocType> getDocTypes()
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

    public Set<PrintCmdDto> getPrintCmds()
    {
        return printCmds;
    }

    public PosLayout getPosLayout()
    {
        return posLayout;
    }

    public Set<DiscountDto> getDiscounts()
    {
        return discounts;
    }

    public Set<CardDto> getCards()
    {
        return cards;
    }

    public PosGridSize getGridSize()
    {
        return gridSize;
    }

    public boolean isGridShowPrice()
    {
        return gridShowPrice;
    }

    public List<FloorDto> getFloors()
    {
        return floors;
    }

    public List<String> getCategoryOids()
    {
        return categoryOids;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
        extends AbstractObjectDto.Builder<Builder, WorkspaceDto>
    {

        private String warehouseOid;
        private String name;
        private String posOid;
        private Set<DocType> docTypes;
        private SpotConfig spotConfig;
        private int spotCount;
        private Set<PrintCmdDto> printCmds;
        private PosLayout posLayout;
        private Set<DiscountDto> discounts;
        private Set<CardDto> cards;
        private PosGridSize gridSize;
        private boolean gridShowPrice;
        private List<FloorDto> floors;
        private List<String> categoryOids;

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

        public Builder withDocTypes(final Set<DocType> _docTypes)
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

        public Builder withPrintCmds(final Set<PrintCmdDto> _printCmds)
        {
            printCmds = _printCmds;
            return this;
        }

        public Builder withPosLayout(final PosLayout _posLayout)
        {
            posLayout = _posLayout;
            return this;
        }

        public Builder withDiscounts(final Set<DiscountDto> _discounts)
        {
            discounts = _discounts;
            return this;
        }

        public Builder withCards(final Set<CardDto> _cards)
        {
            cards = _cards;
            return this;
        }

        public Builder withGridSize(final PosGridSize _gridSize)
        {
            gridSize = _gridSize;
            return this;
        }

        public Builder withGridShowPrice(final boolean _gridShowPrice)
        {
            gridShowPrice = _gridShowPrice;
            return this;
        }

        public Builder withFloors(final List<FloorDto> _floors)
        {
            floors = _floors;
            return this;
        }

        public Builder withCategoryOids(final List<String> _categoryOids)
        {
            categoryOids = _categoryOids;
            return this;
        }

        @Override
        public WorkspaceDto build()
        {
            return new WorkspaceDto(this);
        }
    }
}
