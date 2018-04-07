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

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@JsonDeserialize(builder = ProductDto.Builder.class)
public class ProductDto
    extends AbstractDto
{

    private final String sku;
    private final String description;
    private final String imageOid;
    private final BigDecimal netPrice;
    private final BigDecimal crossPrice;
    private final Set<String> categoryOids;

    private ProductDto(final Builder _builder)
    {
        super(_builder);
        this.sku = _builder.sku;
        this.description = _builder.description;
        this.imageOid = _builder.imageOid;
        this.netPrice = _builder.netPrice;
        this.crossPrice = _builder.crossPrice;
        this.categoryOids = Collections.unmodifiableSet(_builder.categoryOids);
    }

    public String getDescription()
    {
        return this.description;
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
        return this.categoryOids;
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
        extends AbstractDto.Builder<Builder, ProductDto>
    {

        private String sku;
        private String description;
        private String imageOid;
        private BigDecimal netPrice;
        private BigDecimal crossPrice;
        private Set<String> categoryOids = new HashSet<>();

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

        @Override
        public ProductDto build()
        {
            return new ProductDto(this);
        }
    }
}
