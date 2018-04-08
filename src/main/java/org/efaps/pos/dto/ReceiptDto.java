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

import java.util.Set;

@JsonDeserialize(builder = ReceiptDto.Builder.class)
public class ReceiptDto
    extends AbstractDocumentDto
{

    public ReceiptDto(final Builder _builder)
    {
        super(_builder);
    }

    /**
     * Creates builder to build {@link AgendaDto}.
     *
     * @return created builder
     */
    public static Builder builder()
    {
        return new Builder();
    }

    /**
     * Builder to build {@link AgendaDto}.
     */
    public static final class Builder
        extends AbstractDocumentDto.Builder<Builder, ReceiptDto>
    {

        @Override
        public ReceiptDto build()
        {
            return new ReceiptDto(this);
        }

        @Override
        protected Set<? extends AbstractDocItemDto> getItems()
        {
            // TODO Auto-generated method stub
            return null;
        }
    }
}
