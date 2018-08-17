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

@JsonDeserialize(builder = PosDto.Builder.class)
public class PosDto
    extends AbstractObjectDto
{

    private final String name;
    private final String currency;
    private final CompanyDto company;
    private final String defaultContactOid;
    private final String receiptSeqOid;
    private final String invoiceSeqOid;
    private final String ticketSeqOid;

    public PosDto(final Builder _builder)
    {
        super(_builder);
        this.name = _builder.name;
        this.currency = _builder.currency;
        this.company = _builder.company;
        this.defaultContactOid = _builder.defaultContactOid;
        this.receiptSeqOid = _builder.receiptSeqOid;
        this.invoiceSeqOid = _builder.invoiceSeqOid;
        this.ticketSeqOid = _builder.ticketSeqOid;
    }

    public String getName()
    {
        return this.name;
    }

    public String getCurrency()
    {
        return this.currency;
    }

    public CompanyDto getCompany()
    {
        return this.company;
    }

    public String getDefaultContactOid()
    {
        return this.defaultContactOid;
    }

    public String getReceiptSeqOid()
    {
        return this.receiptSeqOid;
    }

    public String getInvoiceSeqOid()
    {
        return this.invoiceSeqOid;
    }

    public String getTicketSeqOid()
    {
        return this.ticketSeqOid;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
        extends AbstractObjectDto.Builder<Builder, PosDto>
    {

        private String name;
        private String currency;
        private CompanyDto company;
        private String defaultContactOid;
        private String receiptSeqOid;
        private String invoiceSeqOid;
        private String ticketSeqOid;

        public Builder withName(final String _name)
        {
            this.name = _name;
            return this;
        }

        public Builder withCurrency(final String _currency)
        {
            this.currency = _currency;
            return this;
        }

        public Builder withCompany(final CompanyDto _company)
        {
            this.company = _company;
            return this;
        }

        public Builder withDefaultContactOid(final String _defaultContactOid)
        {
            this.defaultContactOid = _defaultContactOid;
            return this;
        }

        public Builder withReceiptSeqOid(final String _receiptSeqOid)
        {
            this.receiptSeqOid = _receiptSeqOid;
            return this;
        }

        public Builder withInvoiceSeqOid(final String _invoiceSeqOid)
        {
            this.invoiceSeqOid = _invoiceSeqOid;
            return this;
        }

        public Builder withTicketSeqOid(final String _ticketSeqOid)
        {
            this.ticketSeqOid = _ticketSeqOid;
            return this;
        }

        @Override
        public PosDto build()
        {
            return new PosDto(this);
        }
    }
}
