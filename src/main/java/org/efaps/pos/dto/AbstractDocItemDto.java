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

import java.math.BigDecimal;
import java.util.Set;

public abstract class AbstractDocItemDto
    extends AbstractDto
{

    private final Integer index;
    private final String productOid;
    private final BigDecimal quantity;
    private final BigDecimal netUnitPrice;
    private final BigDecimal crossUnitPrice;
    private final BigDecimal netPrice;
    private final BigDecimal crossPrice;
    private final Set<TaxEntryDto> taxes;

    protected AbstractDocItemDto(final Builder<?, ?> _builder)
    {
        super(_builder);
        this.index = _builder.index;
        this.productOid = _builder.productOid;
        this.quantity = _builder.quantity;
        this.netUnitPrice = _builder.netUnitPrice;
        this.crossUnitPrice = _builder.crossUnitPrice;
        this.netPrice = _builder.netPrice;
        this.crossPrice = _builder.crossPrice;
        this.taxes = _builder.taxes;
    }

    public Integer getIndex()
    {
        return this.index;
    }

    public String getProductOid()
    {
        return this.productOid;
    }

    public BigDecimal getQuantity()
    {
        return this.quantity;
    }

    public BigDecimal getNetUnitPrice()
    {
        return this.netUnitPrice;
    }

    public BigDecimal getCrossUnitPrice()
    {
        return this.crossUnitPrice;
    }

    public BigDecimal getNetPrice()
    {
        return this.netPrice;
    }

    public BigDecimal getCrossPrice()
    {
        return this.crossPrice;
    }

    public Set<TaxEntryDto> getTaxes()
    {
        return this.taxes;
    }

    public static abstract class Builder<S extends Builder<S, T>, T extends AbstractDto>
        extends AbstractDto.Builder<S, T>
    {

        private Integer index;
        private String productOid;
        private BigDecimal quantity;
        private BigDecimal netUnitPrice;
        private BigDecimal crossUnitPrice;
        private BigDecimal netPrice;
        private BigDecimal crossPrice;
        private Set<TaxEntryDto> taxes;

        @SuppressWarnings("unchecked")
        public S withIndex(final Integer _index)
        {
            this.index = _index;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withProductOid(final String _productOid)
        {
            this.productOid = _productOid;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withQuantity(final BigDecimal _quantity)
        {
            this.quantity = _quantity;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withNetUnitPrice(final BigDecimal _netUnitPrice)
        {
            this.netUnitPrice = _netUnitPrice;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withCrossUnitPrice(final BigDecimal _crossUnitPrice)
        {
            this.crossUnitPrice = _crossUnitPrice;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withNetPrice(final BigDecimal _netPrice)
        {
            this.netPrice = _netPrice;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withCrossPrice(final BigDecimal _crossPrice)
        {
            this.crossPrice = _crossPrice;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withTaxes(final Set<TaxEntryDto> _taxes)
        {
            this.taxes = _taxes;
            return (S) this;
        }
    }
}
