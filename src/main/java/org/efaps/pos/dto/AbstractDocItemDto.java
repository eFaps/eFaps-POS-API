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

public abstract class AbstractDocItemDto
    extends AbstractDto
{
    private final Integer index;

    protected AbstractDocItemDto(final Builder<?, ?> _builder)
    {
        super(_builder);
        this.index = _builder.index;
    }

    public Integer getIndex()
    {
        return this.index;
    }

    /**
     * Builder to build {@link AgendaDto}.
     */
    public static abstract class Builder<S extends Builder<S, T>, T extends AbstractDto>
        extends AbstractDto.Builder<S, T>
    {
        private Integer index;

        @SuppressWarnings("unchecked")
        public S withIndex(final Integer _index)
        {
            this.index = _index;
            return (S) this;
        }
    }

}