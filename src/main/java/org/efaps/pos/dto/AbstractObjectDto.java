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

/**
 * The Class AbstractDto.
 */
public abstract class AbstractObjectDto
{

    private final String oid;

    protected AbstractObjectDto(final Builder<?> builder)
    {
        this.oid = builder.oid;
    }

    public String getOid()
    {
        return oid;
    }

    @Override
    public String toString()
    {
        return new StringBuilder().append(this.getClass().getName())
                        .append(" [oid=").append(oid).toString();
    }

    public static abstract class Builder<S extends Builder<S>>
    {

        private String oid;

        @SuppressWarnings("unchecked")
        public S withOID(final String _oid)
        {
            this.oid = _oid;
            return (S) this;
        }
    }

}
