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
import java.time.LocalDate;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class AbstractDocumentDto
    extends AbstractObjectDto
{

    private final String id;
    private final String number;
    private final Set<? extends AbstractDocItemDto> items;
    private final DocStatus status;
    private final LocalDate date;
    private final String currency;
    private final BigDecimal netTotal;
    private final BigDecimal crossTotal;
    private final Set<TaxEntryDto> taxes;
    private final String contactOid;
    private final String workspaceOid;
    private final String note;

    protected AbstractDocumentDto(final Builder<?, ?> _builder)
    {
        super(_builder);
        id = _builder.id;
        number = _builder.number;
        items = _builder.items == null ? Collections.emptySet() : _builder.items;
        status = _builder.status;
        date = _builder.date;
        netTotal = _builder.netTotal;
        crossTotal = _builder.crossTotal;
        taxes = _builder.taxes == null ? Collections.emptySet() : _builder.taxes;
        currency = _builder.currency;
        contactOid = _builder.contactOid;
        workspaceOid = _builder.workspaceOid;
        note = _builder.note;
    }

    public String getId()
    {
        return id;
    }

    public String getNumber()
    {
        return number;
    }

    public Set<? extends AbstractDocItemDto> getItems()
    {
        return Collections.unmodifiableSet(items);
    }

    public DocStatus getStatus()
    {
        return status;
    }

    public LocalDate getDate()
    {
        return date;
    }

    public String getCurrency()
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

    public Set<TaxEntryDto> getTaxes()
    {
        return Collections.unmodifiableSet(taxes);
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

    public static abstract class Builder<S extends Builder<S, T>, T extends AbstractObjectDto>
        extends AbstractObjectDto.Builder<S, T>
    {

        private String id;
        private String number;
        private DocStatus status;
        private LocalDate date = LocalDate.now();
        private String currency;
        private BigDecimal netTotal;
        private BigDecimal crossTotal;
        private Set<TaxEntryDto> taxes;
        private Set<? extends AbstractDocItemDto> items = new HashSet<>();
        private String contactOid;
        private String workspaceOid;
        private String note;

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
        public S withCurrency(final String _currency)
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
        public S withTaxes(final Set<TaxEntryDto> _taxes)
        {
            this.taxes = _taxes;
            return (S) this;
        }

        protected void setItems(final Set<? extends AbstractDocItemDto> _items)
        {
            this.items = _items;
        }
    }
}
