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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(builder = ProductDto.Builder.class)
public class ProductDto
    extends AbstractObjectDto
{

    private final String sku;
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

    private ProductDto(final Builder _builder)
    {
        super(_builder);
        this.sku = _builder.sku;
        this.description = _builder.description;
        this.note = _builder.note;
        this.imageOid = _builder.imageOid;
        this.netPrice = _builder.netPrice;
        this.crossPrice = _builder.crossPrice;
        this.categoryOids = _builder.categoryOids == null ? Collections.emptySet() : _builder.categoryOids;
        this.taxes = _builder.taxes == null ? Collections.emptySet() : _builder.taxes;
        this.uoM = _builder.uoM;
        this.uoMCode = _builder.uoMCode;
        this.relations =  _builder.relations == null ? Collections.emptySet() : _builder.relations;
    }

    public String getDescription()
    {
        return this.description;
    }

    public String getNote()
    {
        return this.note;
    }

    public String getImageOid()
    {
        return this.imageOid;
    }

    public String getSku()
    {
        return this.sku;
    }

    public BigDecimal getNetPrice()
    {
        return this.netPrice;
    }

    public BigDecimal getCrossPrice()
    {
        return this.crossPrice;
    }

    public Set<String> getCategoryOids()
    {
        return Collections.unmodifiableSet(this.categoryOids);
    }

    public Set<TaxDto> getTaxes()
    {
        return Collections.unmodifiableSet(this.taxes);
    }

    public String getUoM()
    {
        return this.uoM;
    }

    public String getUoMCode()
    {
        return this.uoMCode;
    }

    public Set<ProductRelationDto> getRelations()
    {
        return this.relations;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
        extends AbstractObjectDto.Builder<Builder, ProductDto>
    {

        private String sku;
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

        public Builder withSKU(final String _sku)
        {
            this.sku = _sku;
            return this;
        }

        public Builder withDescription(final String _description)
        {
            this.description = _description;
            return this;
        }

        public Builder withNote(final String _note)
        {
            this.note = _note;
            return this;
        }

        public Builder withImageOid(final String _imageOid)
        {
            this.imageOid = _imageOid;
            return this;
        }

        public Builder withNetPrice(final BigDecimal _netPrice)
        {
            this.netPrice = _netPrice;
            return this;
        }

        public Builder withCrossPrice(final BigDecimal _crossPrice)
        {
            this.crossPrice = _crossPrice;
            return this;
        }

        public Builder withCategoryOids(final Set<String> _categoryOids)
        {
            this.categoryOids = _categoryOids;
            return this;
        }

        public Builder withTaxes(final Set<TaxDto> _taxes)
        {
            this.taxes = _taxes;
            return this;
        }

        public Builder withUoM(final String _uoM)
        {
            this.uoM = _uoM;
            return this;
        }

        public Builder withUoMCode(final String _uoMCode)
        {
            this.uoMCode = _uoMCode;
            return this;
        }

        public Builder withRelations(final Set<ProductRelationDto> _relations)
        {
            this.relations = _relations;
            return this;
        }

        @Override
        public ProductDto build()
        {
            return new ProductDto(this);
        }
    }
}
