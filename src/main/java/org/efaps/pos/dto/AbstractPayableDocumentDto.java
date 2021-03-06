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

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class AbstractPayableDocumentDto
    extends AbstractDocumentDto
{
    private final String balanceOid;

    private final Set<PaymentDto> payments;

    protected AbstractPayableDocumentDto(final Builder<?, ?> _builder)
    {
        super(_builder);
        this.balanceOid =  _builder.balanceOid;
        this.payments = _builder.payments == null ? Collections.emptySet() : _builder.payments;
    }

    public String getBalanceOid()
    {
        return this.balanceOid;
    }

    public Set<PaymentDto> getPayments()
    {
        return Collections.unmodifiableSet(this.payments);
    }

    public static abstract class Builder<S extends Builder<S, T>, T extends AbstractDocumentDto>
        extends AbstractDocumentDto.Builder<S, T>
    {
        private String balanceOid;
        private Set<PaymentDto> payments = new HashSet<>();

        @SuppressWarnings("unchecked")
        public S withBalanceOid(final String _balanceOid)
        {
            this.balanceOid = _balanceOid;
            return (S) this;
        }

        protected void setPayments(final Set<PaymentDto> _payments)
        {
            this.payments = _payments;
        }
    }
}
