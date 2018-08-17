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

@JsonDeserialize(builder = SequenceDto.Builder.class)
public class SequenceDto
    extends AbstractObjectDto
{

    private final long seq;
    private final String format;

    public SequenceDto(final Builder _builder)
    {
        super(_builder);
        this.seq = _builder.seq;
        this.format = _builder.format;
    }

    public long getSeq()
    {
        return this.seq;
    }

    public String getFormat()
    {
        return this.format;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
        extends AbstractObjectDto.Builder<Builder, SequenceDto>
    {

        private long seq;

        private String format;

        public Builder withSeq(final long _seq)
        {
            this.seq = _seq;
            return this;
        }

        public Builder withFormat(final String _format)
        {
            this.format = _format;
            return this;
        }

        @Override
        public SequenceDto build()
        {
            return new SequenceDto(this);
        }
    }
}
