/*
 * Copyright 2003 - 2019 The eFaps Team
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
    private final String currency;
    private final String defaultContactOid;
    private final String receiptSeqOid;
    private final String invoiceSeqOid;
    private final String ticketSeqOid;

    public PosDto(final Builder _builder)
    {
        super(_builder);
        name = _builder.name;
        currency = _builder.currency;
        defaultContactOid = _builder.defaultContactOid;
        receiptSeqOid = _builder.receiptSeqOid;
        invoiceSeqOid = _builder.invoiceSeqOid;
        ticketSeqOid = _builder.ticketSeqOid;
    }

    public String getName()
    {
        return name;
    }

    public String getCurrency()
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

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
        extends AbstractObjectDto.Builder<Builder, PosDto>
    {

        private String name;
        private String currency;
        private String defaultContactOid;
        private String receiptSeqOid;
        private String invoiceSeqOid;
        private String ticketSeqOid;

        public Builder withName(final String _name)
        {
            name = _name;
            return this;
        }

        public Builder withCurrency(final String _currency)
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

        @Override
        public PosDto build()
        {
            return new PosDto(this);
        }
    }
}
