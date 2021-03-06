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

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = ProductDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDto
    extends AbstractObjectDto
{

    private final String sku;
    private final ProductType type;
    private final String description;
    private final String note;
    private final String imageOid;
    private final BigDecimal netPrice;
    private final BigDecimal crossPrice;
    private final Set<String> categoryOids;
    private final Set<TaxDto> taxes;
    private final String uoM;
    private final String uoMCode;
    private final Set<ProductRelationDto> relations;
    private final Set<IndicationSetDto> indicationSets;
    private final Set<BarcodeDto> barcodes;

    private ProductDto(final Builder _builder)
    {
        super(_builder);
        sku = _builder.sku;
        type = _builder.type;
        description = _builder.description;
        note = _builder.note;
        imageOid = _builder.imageOid;
        netPrice = _builder.netPrice;
        crossPrice = _builder.crossPrice;
        categoryOids = _builder.categoryOids == null ? Collections.emptySet() : _builder.categoryOids;
        taxes = _builder.taxes == null ? Collections.emptySet() : _builder.taxes;
        uoM = _builder.uoM;
        uoMCode = _builder.uoMCode;
        relations = _builder.relations == null ? Collections.emptySet() : _builder.relations;
        indicationSets = _builder.indicationSets == null ? Collections.emptySet() : _builder.indicationSets;
        barcodes = _builder.barcodes == null ? Collections.emptySet() : _builder.barcodes;
    }

    public String getSku()
    {
        return sku;
    }

    public ProductType getType()
    {
        return type;
    }

    public String getDescription()
    {
        return description;
    }

    public String getNote()
    {
        return note;
    }

    public String getImageOid()
    {
        return imageOid;
    }

    public BigDecimal getNetPrice()
    {
        return netPrice;
    }

    public BigDecimal getCrossPrice()
    {
        return crossPrice;
    }

    public Set<String> getCategoryOids()
    {
        return Collections.unmodifiableSet(categoryOids);
    }

    public Set<TaxDto> getTaxes()
    {
        return Collections.unmodifiableSet(taxes);
    }

    public String getUoM()
    {
        return uoM;
    }

    public String getUoMCode()
    {
        return uoMCode;
    }

    public Set<ProductRelationDto> getRelations()
    {
        return relations;
    }

    public Set<IndicationSetDto> getIndicationSets()
    {
        return indicationSets;
    }

    public Set<BarcodeDto> getBarcodes()
    {
        return barcodes;
    }

    @Override
    public String toString()
    {
        final StringBuilder builder2 = new StringBuilder();
        builder2.append("ProductDto [sku=").append(sku).append(", type=").append(type).append(", description=")
                        .append(description).append(", note=").append(note).append(", imageOid=").append(imageOid)
                        .append(", netPrice=").append(netPrice).append(", crossPrice=").append(crossPrice)
                        .append(", categoryOids=").append(categoryOids).append(", taxes=").append(taxes)
                        .append(", uoM=").append(uoM).append(", uoMCode=").append(uoMCode).append(", relations=")
                        .append(relations).append(", indicationSets=").append(indicationSets).append(", barcodes=")
                        .append(barcodes).append("]");
        return builder2.toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
        extends AbstractObjectDto.Builder<Builder, ProductDto>
    {

        private String sku;
        private ProductType type;
        private String description;
        private String note;
        private String imageOid;
        private BigDecimal netPrice;
        private BigDecimal crossPrice;
        private Set<String> categoryOids = new HashSet<>();
        private Set<TaxDto> taxes = new HashSet<>();
        private String uoM;
        private String uoMCode;
        private Set<ProductRelationDto> relations;
        private Set<IndicationSetDto> indicationSets;
        private Set<BarcodeDto> barcodes;

        public Builder withSKU(final String _sku)
        {
            sku = _sku;
            return this;
        }

        public Builder withType(final ProductType _type)
        {
            type = _type;
            return this;
        }

        public Builder withDescription(final String _description)
        {
            description = _description;
            return this;
        }

        public Builder withNote(final String _note)
        {
            note = _note;
            return this;
        }

        public Builder withImageOid(final String _imageOid)
        {
            imageOid = _imageOid;
            return this;
        }

        public Builder withNetPrice(final BigDecimal _netPrice)
        {
            netPrice = _netPrice;
            return this;
        }

        public Builder withCrossPrice(final BigDecimal _crossPrice)
        {
            crossPrice = _crossPrice;
            return this;
        }

        public Builder withCategoryOids(final Set<String> _categoryOids)
        {
            categoryOids = _categoryOids;
            return this;
        }

        public Builder withTaxes(final Set<TaxDto> _taxes)
        {
            taxes = _taxes;
            return this;
        }

        public Builder withUoM(final String _uoM)
        {
            uoM = _uoM;
            return this;
        }

        public Builder withUoMCode(final String _uoMCode)
        {
            uoMCode = _uoMCode;
            return this;
        }

        public Builder withRelations(final Set<ProductRelationDto> _relations)
        {
            relations = _relations;
            return this;
        }

        public Builder withIndicationSets(final Set<IndicationSetDto> _indicationSets)
        {
            indicationSets = _indicationSets;
            return this;
        }

        public Builder withBarcodes(final Set<BarcodeDto> _barcodes)
        {
            barcodes = _barcodes;
            return this;
        }

        @Override
        public ProductDto build()
        {
            return new ProductDto(this);
        }
    }
}
