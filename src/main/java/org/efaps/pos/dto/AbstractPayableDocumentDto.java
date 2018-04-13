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

import java.util.Set;

public abstract class AbstractPayableDocumentDto
    extends AbstractDocumentDto
{

    private final Set<PaymentDto> payments;

    protected AbstractPayableDocumentDto(final Builder<?, ?> _builder)
    {
        super(_builder);
        this.payments = _builder.payments;
    }

    public Set<PaymentDto> getPayments()
    {
        return this.payments;
    }

    /**
     * Builder to build {@link AgendaDto}.
     */
    public static abstract class Builder<S extends Builder<S, T>, T extends AbstractDocumentDto>
        extends AbstractDocumentDto.Builder<S, T>
    {
        private Set<PaymentDto> payments;

        protected void setPayments(final Set<PaymentDto> _payments)
        {
            this.payments = _payments;
        }
    }
}
