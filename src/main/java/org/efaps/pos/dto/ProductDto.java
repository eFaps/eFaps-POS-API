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

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

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
    private final Currency currency;
    private final Collection<Product2CategoryDto> categories;
    private final Collection<TaxDto> taxes;
    private final String uoM;
    private final String uoMCode;
    private final Collection<ProductRelationDto> relations;
    private final Collection<IndicationSetDto> indicationSets;
    private final Collection<BarcodeDto> barcodes;
    private final Collection<BOMGroupConfigDto> bomGroupConfigs;
    private final Collection<ConfigurationBOMDto> configurationBOMs;
    private final ProductIndividual individual;

    private ProductDto(final Builder builder)
    {
        super(builder);
        this.sku = builder.sku;
        this.type = builder.type;
        this.description = builder.description;
        this.note = builder.note;
        this.imageOid = builder.imageOid;
        this.netPrice = builder.netPrice;
        this.crossPrice = builder.crossPrice;
        this.currency = builder.currency;
        this.categories = builder.categories == null ? Collections.emptySet() : builder.categories;
        this.taxes = builder.taxes == null ? Collections.emptySet() : builder.taxes;
        this.uoM = builder.uoM;
        this.uoMCode = builder.uoMCode;
        this.relations = builder.relations == null ? Collections.emptySet() : builder.relations;
        this.indicationSets = builder.indicationSets == null ? Collections.emptySet() : builder.indicationSets;
        this.barcodes = builder.barcodes == null ? Collections.emptySet() : builder.barcodes;
        this.bomGroupConfigs = builder.bomGroupConfigs == null ? Collections.emptySet() : builder.bomGroupConfigs;
        this.configurationBOMs = builder.configurationBOMs == null ? Collections.emptySet() : builder.configurationBOMs;
        this.individual = builder.individual;
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

    public Currency getCurrency()
    {
        return currency;
    }

    public Collection<Product2CategoryDto> getCategories()
    {
        return Collections.unmodifiableCollection(categories);
    }

    public Collection<TaxDto> getTaxes()
    {
        return Collections.unmodifiableCollection(taxes);
    }

    public String getUoM()
    {
        return uoM;
    }

    public String getUoMCode()
    {
        return uoMCode;
    }

    public Collection<ProductRelationDto> getRelations()
    {
        return relations;
    }

    public Collection<IndicationSetDto> getIndicationSets()
    {
        return indicationSets;
    }

    public Collection<BarcodeDto> getBarcodes()
    {
        return barcodes;
    }

    public Collection<BOMGroupConfigDto> getBomGroupConfigs()
    {
        return bomGroupConfigs;
    }

    public Collection<ConfigurationBOMDto> getConfigurationBOMs()
    {
        return configurationBOMs;
    }

    public ProductIndividual getIndividual()
    {
        return individual;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", sku=").append(sku)
                        .append(", type=").append(type)
                        .append(", description=").append(description)
                        .append(", note=").append(note)
                        .append(", imageOid=").append(imageOid)
                        .append(", netPrice=").append(netPrice)
                        .append(", crossPrice=").append(crossPrice)
                        .append(", categories=").append(categories)
                        .append(", taxes=").append(taxes)
                        .append(", uoM=").append(uoM)
                        .append(", uoMCode=").append(uoMCode)
                        .append(", relations=").append(relations)
                        .append(", indicationSets=").append(indicationSets)
                        .append(", barcodes=").append(barcodes)
                        .append(", bomGroupConfigs=").append(bomGroupConfigs)
                        .append(", configurationBOMs=").append(configurationBOMs)
                        .append(", individual=").append(individual)
                        .append("]").toString();
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
        private Currency currency;
        private Collection<Product2CategoryDto> categories;
        private Collection<TaxDto> taxes = new HashSet<>();
        private String uoM;
        private String uoMCode;
        private Collection<ProductRelationDto> relations;
        private Collection<IndicationSetDto> indicationSets;
        private Collection<BarcodeDto> barcodes;
        private Collection<BOMGroupConfigDto> bomGroupConfigs;
        private Collection<ConfigurationBOMDto> configurationBOMs;
        private ProductIndividual individual;

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

        public Builder withCurrency(final Currency _currency)
        {
            currency = _currency;
            return this;
        }

        public Builder withCategories(final Collection<Product2CategoryDto> _categories)
        {
            categories = _categories;
            return this;
        }

        public Builder withTaxes(final Collection<TaxDto> _taxes)
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

        public Builder withRelations(final Collection<ProductRelationDto> _relations)
        {
            relations = _relations;
            return this;
        }

        public Builder withIndicationSets(final Collection<IndicationSetDto> _indicationSets)
        {
            indicationSets = _indicationSets;
            return this;
        }

        public Builder withBarcodes(final Collection<BarcodeDto> _barcodes)
        {
            barcodes = _barcodes;
            return this;
        }

        public Builder withBomGroupConfigs(final Collection<BOMGroupConfigDto> bomGroupConfigs)
        {
            this.bomGroupConfigs = bomGroupConfigs;
            return this;
        }

        public Builder withConfigurationBOMs(final Collection<ConfigurationBOMDto> configurationBOMs)
        {
            this.configurationBOMs = configurationBOMs;
            return this;
        }

        public Builder withIndividual(final ProductIndividual individual)
        {
            this.individual = individual;
            return this;
        }

        @Override
        public ProductDto build()
        {
            return new ProductDto(this);
        }
    }
}
