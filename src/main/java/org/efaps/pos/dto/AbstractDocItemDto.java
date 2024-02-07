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

public abstract class AbstractDocItemDto
    extends AbstractObjectDto
{

    private final Integer index;
    private final Integer parentIdx;
    private final String productOid;
    private final BigDecimal quantity;
    private final BigDecimal netUnitPrice;
    private final BigDecimal crossUnitPrice;
    private final BigDecimal netPrice;
    private final BigDecimal crossPrice;
    private final Currency currency;
    private final BigDecimal exchangeRate;
    private final Collection<TaxEntryDto> taxes;
    private final String remark;

    protected AbstractDocItemDto(final Builder<?, ?> _builder)
    {
        super(_builder);
        index = _builder.index;
        parentIdx = _builder.parentIdx;
        productOid = _builder.productOid;
        quantity = _builder.quantity;
        netUnitPrice = _builder.netUnitPrice;
        crossUnitPrice = _builder.crossUnitPrice;
        netPrice = _builder.netPrice;
        crossPrice = _builder.crossPrice;
        currency = _builder.currency == null ? Currency.PEN : _builder.currency;
        exchangeRate = _builder.exchangeRate == null ? BigDecimal.ONE : _builder.exchangeRate;
        taxes = _builder.taxes;
        remark = _builder.remark;
    }

    public Integer getIndex()
    {
        return index;
    }

    public Integer getParentIdx()
    {
        return parentIdx;
    }

    public String getProductOid()
    {
        return productOid;
    }

    public BigDecimal getQuantity()
    {
        return quantity;
    }

    public BigDecimal getNetUnitPrice()
    {
        return netUnitPrice;
    }

    public BigDecimal getCrossUnitPrice()
    {
        return crossUnitPrice;
    }

    public BigDecimal getNetPrice()
    {
        return netPrice;
    }

    public BigDecimal getCrossPrice()
    {
        return crossPrice;
    }

    public Collection<TaxEntryDto> getTaxes()
    {
        return taxes;
    }

    public String getRemark()
    {
        return remark;
    }

    public Currency getCurrency()
    {
        return currency;
    }

    public BigDecimal getExchangeRate()
    {
        return exchangeRate;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", index=").append(index)
                        .append(", parentIdx=").append(parentIdx)
                        .append(", productOid=").append(productOid)
                        .append(", quantity=").append(quantity)
                        .append(", netUnitPrice=").append(netUnitPrice)
                        .append(", crossUnitPrice=").append(crossUnitPrice)
                        .append(", netPrice=").append(netPrice)
                        .append(", crossPrice=").append(crossPrice)
                        .append(", currency=").append(currency)
                        .append(", exchangeRate=").append(exchangeRate)
                        .append(", taxes=").append(taxes)
                        .append(", remark=").append(remark).toString();
    }

    public static abstract class Builder<S extends Builder<S, T>, T extends AbstractObjectDto>
        extends AbstractObjectDto.Builder<S, T>
    {

        private Integer index;
        private Integer parentIdx;
        private String productOid;
        private BigDecimal quantity;
        private BigDecimal netUnitPrice;
        private BigDecimal crossUnitPrice;
        private BigDecimal netPrice;
        private BigDecimal crossPrice;
        private Currency currency;
        private BigDecimal exchangeRate;
        private Collection<TaxEntryDto> taxes;
        private String remark;

        @SuppressWarnings("unchecked")
        public S withIndex(final Integer _index)
        {
            this.index = _index;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withParentIdx(final Integer parentIdx)
        {
            this.parentIdx = parentIdx;
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
        public S withCurrency(final Currency _currency)
        {
            this.currency = _currency;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withExchangeRate(final BigDecimal exchangeRate)
        {
            this.exchangeRate = exchangeRate;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withTaxes(final Collection<TaxEntryDto> _taxes)
        {
            this.taxes = _taxes;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withRemark(final String _remark)
        {
            this.remark = _remark;
            return (S) this;
        }
    }
}
