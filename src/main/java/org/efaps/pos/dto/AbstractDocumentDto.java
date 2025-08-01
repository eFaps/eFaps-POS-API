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
import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public abstract class AbstractDocumentDto
    extends AbstractObjectDto
{

    private final String id;
    private final String number;
    private final Collection<? extends AbstractDocItemDto> items;
    private final DocStatus status;
    private final LocalDate date;
    private final Currency currency;
    private final BigDecimal netTotal;
    private final BigDecimal crossTotal;
    private final BigDecimal exchangeRate;
    private final BigDecimal payableAmount;
    private final Collection<TaxEntryDto> taxes;
    private final String contactOid;
    private final String workspaceOid;
    private final String note;
    private final Collection<EmployeeRelationDto> employeeRelations;
    private final PromoInfoDto promotionInfo;

    protected AbstractDocumentDto(final Builder<?> _builder)
    {
        super(_builder);
        id = _builder.id;
        number = _builder.number;
        items = _builder.items == null ? Collections.emptySet() : _builder.items;
        status = _builder.status;
        date = _builder.date;
        netTotal = _builder.netTotal;
        crossTotal = _builder.crossTotal;
        payableAmount = _builder.payableAmount;
        currency = _builder.currency == null ? Currency.PEN : _builder.currency;
        exchangeRate = _builder.exchangeRate == null ? BigDecimal.ONE : _builder.exchangeRate;
        taxes = _builder.taxes == null ? Collections.emptySet() : _builder.taxes;
        contactOid = _builder.contactOid;
        workspaceOid = _builder.workspaceOid;
        note = _builder.note;
        employeeRelations = _builder.employeeRelations  == null ? Collections.emptySet() : _builder.employeeRelations;
        promotionInfo = _builder.promotionInfo;
    }

    public String getId()
    {
        return id;
    }

    public String getNumber()
    {
        return number;
    }

    public Collection<? extends AbstractDocItemDto> getItems()
    {
        return Collections.unmodifiableCollection(items);
    }

    public DocStatus getStatus()
    {
        return status;
    }

    public LocalDate getDate()
    {
        return date;
    }

    public Currency getCurrency()
    {
        return currency;
    }

    public BigDecimal getNetTotal()
    {
        return netTotal;
    }

    public BigDecimal getCrossTotal()
    {
        return crossTotal;
    }

    public BigDecimal getPayableAmount()
    {
        return payableAmount;
    }

    public Collection<TaxEntryDto> getTaxes()
    {
        return Collections.unmodifiableCollection(taxes);
    }

    public String getContactOid()
    {
        return contactOid;
    }

    public String getWorkspaceOid()
    {
        return workspaceOid;
    }

    public String getNote()
    {
        return note;
    }

    public BigDecimal getExchangeRate()
    {
        return exchangeRate;
    }

    public Collection<EmployeeRelationDto> getEmployeeRelations()
    {
        return Collections.unmodifiableCollection(employeeRelations);
    }

    public PromoInfoDto getPromotionInfo()
    {
        return promotionInfo;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(",id=").append(id)
                        .append(", number=").append(number)
                        .append(", items=").append(items)
                        .append(", status=").append(status)
                        .append(", date=").append(date)
                        .append(", currency=").append(currency)
                        .append(", netTotal=").append(netTotal)
                        .append(", crossTotal=").append(crossTotal)
                        .append(", exchangeRate=").append(exchangeRate)
                        .append(", taxes=").append(taxes)
                        .append(", contactOid=").append(contactOid)
                        .append(", workspaceOid=").append(workspaceOid)
                        .append(", note=").append(note)
                        .append(", employeeRelations=").append(employeeRelations)
                        .append(", promotionInfo=").append(promotionInfo)
                        .toString();
    }

    public static abstract class Builder<S extends Builder<S>>
        extends AbstractObjectDto.Builder<S>
    {

        private String id;
        private String number;
        private DocStatus status;
        private LocalDate date = LocalDate.now();
        private Currency currency;
        private BigDecimal netTotal;
        private BigDecimal crossTotal;
        private BigDecimal exchangeRate;
        private BigDecimal payableAmount;
        private Collection<TaxEntryDto> taxes;
        private Collection<? extends AbstractDocItemDto> items = new HashSet<>();
        private String contactOid;
        private String workspaceOid;
        private String note;
        private Collection<EmployeeRelationDto> employeeRelations;
        private PromoInfoDto promotionInfo;

        @SuppressWarnings("unchecked")
        public S withId(final String _id)
        {
            this.id = _id;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withNumber(final String _number)
        {
            this.number = _number;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withStatus(final DocStatus _status)
        {
            this.status = _status;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withDate(final LocalDate _date)
        {
            this.date = _date;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withCurrency(final Currency _currency)
        {
            this.currency = _currency;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withNetTotal(final BigDecimal _netTotal)
        {
            this.netTotal = _netTotal;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withCrossTotal(final BigDecimal _crossTotal)
        {
            this.crossTotal = _crossTotal;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withExchangeRate(final BigDecimal exchangeRate)
        {
            this.exchangeRate = exchangeRate;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withPayableAmount(final BigDecimal payableAmount)
        {
            this.payableAmount = payableAmount;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withContactOid(final String _contactOid)
        {
            this.contactOid = _contactOid;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withWorkspaceOid(final String _workspaceOid)
        {
            this.workspaceOid = _workspaceOid;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withNote(final String _note)
        {
            this.note = _note;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withTaxes(final Collection<TaxEntryDto> _taxes)
        {
            this.taxes = _taxes;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withEmployeeRelations(final Collection<EmployeeRelationDto> employeeRelations)
        {
            this.employeeRelations = employeeRelations;
            return (S) this;
        }

        @SuppressWarnings("unchecked")
        public S withPromotionInfo(final PromoInfoDto promotionInfo)
        {
            this.promotionInfo = promotionInfo;
            return (S) this;
        }

        protected void setItems(final Collection<? extends AbstractDocItemDto> _items)
        {
            this.items = _items;
        }
    }
}
