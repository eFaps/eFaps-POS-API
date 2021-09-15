/*
 * Copyright 2003 - 2021 The eFaps Team
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

@JsonDeserialize(builder = SequenceDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SequenceDto
    extends AbstractObjectDto
{

    private final long seq;
    private final String format;

    public SequenceDto(final Builder _builder)
    {
        super(_builder);
        seq = _builder.seq;
        format = _builder.format;
    }

    public long getSeq()
    {
        return seq;
    }

    public String getFormat()
    {
        return format;
    }
    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", seq=").append(seq)
                        .append(", format=").append(format)
                        .append("]").toString();
    }
    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
        extends AbstractObjectDto.Builder<Builder, SequenceDto>
    {

        private long seq;

        private String format;

        public Builder withSeq(final long _seq)
        {
            seq = _seq;
            return this;
        }

        public Builder withFormat(final String _format)
        {
            format = _format;
            return this;
        }

        @Override
        public SequenceDto build()
        {
            return new SequenceDto(this);
        }
    }
}
