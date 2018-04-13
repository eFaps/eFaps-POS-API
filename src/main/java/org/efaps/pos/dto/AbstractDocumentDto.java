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

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractDocumentDto
    extends AbstractDto
{
    private final String id;

    private final String number;

    private final Set<? extends AbstractDocItemDto> items;

    private final DocStatus status;

    protected AbstractDocumentDto(final Builder<?, ?> _builder)
    {
        super(_builder);
        this.id = _builder.id;
        this.number = _builder.number;
        this.items = _builder.items;
        this.status = _builder.status;
    }

    public String getId()
    {
        return this.id;
    }

    public String getNumber()
    {
        return this.number;
    }

    public Set<? extends AbstractDocItemDto> getItems()
    {
        return this.items;
    }

    public DocStatus getStatus()
    {
        return this.status;
    }

    /**
     * Builder to build {@link AgendaDto}.
     */
    public static abstract class Builder<S extends Builder<S, T>, T extends AbstractDto>
        extends AbstractDto.Builder<S, T>
    {
        private String id;
        private String number;
        private DocStatus status;
        private Set<DocItemDto> items = new HashSet<>();

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

        protected void setItems(final Set<DocItemDto> _items)
        {
            this.items = _items;
        }
    }
}
