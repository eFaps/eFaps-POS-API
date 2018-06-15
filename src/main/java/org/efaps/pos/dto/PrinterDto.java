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

@JsonDeserialize(builder = WarehouseDto.Builder.class)
public class PrinterDto
    extends AbstractDto
{

    private final String name;
    private final PrinterType type;

    private PrinterDto(final Builder _builder)
    {
        super(_builder);
        this.name = _builder.name;
        this.type = _builder.type;
    }

    public String getName()
    {
        return this.name;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
        extends AbstractDto.Builder<Builder, PrinterDto>
    {

        private String name;
        private PrinterType type;

        public Builder withName(final String _name)
        {
            this.name = _name;
            return this;
        }

        public Builder withType(final PrinterType _type)
        {
            this.type = _type;
            return this;
        }

        @Override
        public PrinterDto build()
        {
            return new PrinterDto(this);
        }
    }

    public PrinterType getType()
    {
        return this.type;
    }
}
