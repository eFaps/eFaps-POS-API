/*
 * Copyright 2003 - 2021 The eFaps Team
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

@JsonDeserialize(builder = PosDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PosDto
    extends AbstractObjectDto
{

    private final String name;
    private final Currency currency;
    private final String defaultContactOid;
    private final String receiptSeqOid;
    private final String invoiceSeqOid;
    private final String ticketSeqOid;
    private final String creditNote4InvoiceSeqOid;
    private final String creditNote4ReceiptSeqOid;

    public PosDto(final Builder _builder)
    {
        super(_builder);
        name = _builder.name;
        currency = _builder.currency;
        defaultContactOid = _builder.defaultContactOid;
        receiptSeqOid = _builder.receiptSeqOid;
        invoiceSeqOid = _builder.invoiceSeqOid;
        ticketSeqOid = _builder.ticketSeqOid;
        creditNote4InvoiceSeqOid = _builder.creditNote4InvoiceSeqOid;
        creditNote4ReceiptSeqOid = _builder.creditNote4ReceiptSeqOid;
    }

    public String getName()
    {
        return name;
    }

    public Currency getCurrency()
    {
        return currency;
    }

    public String getDefaultContactOid()
    {
        return defaultContactOid;
    }

    public String getReceiptSeqOid()
    {
        return receiptSeqOid;
    }

    public String getInvoiceSeqOid()
    {
        return invoiceSeqOid;
    }

    public String getTicketSeqOid()
    {
        return ticketSeqOid;
    }



    public String getCreditNote4InvoiceSeqOid()
    {
        return creditNote4InvoiceSeqOid;
    }

    public String getCreditNote4ReceiptSeqOid()
    {
        return creditNote4ReceiptSeqOid;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(",name=").append(name)
                        .append(", currency=").append(currency)
                        .append(", defaultContactOid=").append(defaultContactOid)
                        .append(", receiptSeqOid=").append(receiptSeqOid)
                        .append(", invoiceSeqOid=").append(invoiceSeqOid)
                        .append(", ticketSeqOid=").append(ticketSeqOid)
                        .append(", creditNote4InvoiceSeqOid=").append(creditNote4InvoiceSeqOid)
                        .append(", creditNote4ReceiptSeqOid=").append(creditNote4ReceiptSeqOid)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
        extends AbstractObjectDto.Builder<Builder, PosDto>
    {

        private String name;
        private Currency currency;
        private String defaultContactOid;
        private String receiptSeqOid;
        private String invoiceSeqOid;
        private String ticketSeqOid;
        private String creditNote4InvoiceSeqOid;
        private String creditNote4ReceiptSeqOid;

        public Builder withName(final String _name)
        {
            name = _name;
            return this;
        }

        public Builder withCurrency(final Currency _currency)
        {
            currency = _currency;
            return this;
        }

        public Builder withDefaultContactOid(final String _defaultContactOid)
        {
            defaultContactOid = _defaultContactOid;
            return this;
        }

        public Builder withReceiptSeqOid(final String _receiptSeqOid)
        {
            receiptSeqOid = _receiptSeqOid;
            return this;
        }

        public Builder withInvoiceSeqOid(final String _invoiceSeqOid)
        {
            invoiceSeqOid = _invoiceSeqOid;
            return this;
        }

        public Builder withTicketSeqOid(final String _ticketSeqOid)
        {
            ticketSeqOid = _ticketSeqOid;
            return this;
        }

        public Builder withCreditNote4InvoiceSeqOid(final String _creditNote4InvoiceSeqOid)
        {
            creditNote4InvoiceSeqOid = _creditNote4InvoiceSeqOid;
            return this;
        }

        public Builder withCreditNote4ReceiptSeqOid(final String _creditNote4ReceiptSeqOid)
        {
            creditNote4ReceiptSeqOid = _creditNote4ReceiptSeqOid;
            return this;
        }

        @Override
        public PosDto build()
        {
            return new PosDto(this);
        }
    }
}
