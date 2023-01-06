/*
 * Copyright 2003 - 2022 The eFaps Team
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

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = CreditNoteDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreditNoteDto
    extends AbstractPayableDocumentDto
{

    private final String sourceDocOid;

    public CreditNoteDto(final Builder _builder)
    {
        super(_builder);
        sourceDocOid = _builder.sourceDocOid;
    }

    public String getSourceDocOid()
    {
        return sourceDocOid;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", sourceDocOid=").append(sourceDocOid)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
        extends AbstractPayableDocumentDto.Builder<Builder, CreditNoteDto>
    {

        private String sourceDocOid;

        public Builder withItems(final Set<DocItemDto> _items)
        {
            setItems(_items);
            return this;
        }

        public Builder withPayments(final Set<PaymentDto> _payments)
        {
            setPayments(_payments);
            return this;
        }

        public Builder withSourceDocOid( final String _sourceDocOid) {
            sourceDocOid = _sourceDocOid;
            return this;
        }

        @Override
        public CreditNoteDto build()
        {
            return new CreditNoteDto(this);
        }
    }
}