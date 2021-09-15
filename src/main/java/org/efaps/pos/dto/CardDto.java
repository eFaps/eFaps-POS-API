/*
 * Copyright 2003 - 2019 The eFaps Team
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

@JsonDeserialize(builder = CardDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CardDto
{

    private final String label;

    private final long cardTypeId;

    private CardDto(final Builder _builder)
    {
        label = _builder.label;
        cardTypeId = _builder.cardTypeId;
    }

    public String getLabel()
    {
        return label;
    }

    public long getCardTypeId()
    {
        return cardTypeId;
    }

    @Override
    public String toString()
    {
        return new StringBuilder().append("CardDto [label=").append(label).append(", cardTypeId=").append(cardTypeId)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
    {

        private String label;
        private long cardTypeId;

        public Builder withLabel(final String _label)
        {
            label = _label;
            return this;
        }

        public Builder withCardTypeId(final long _cardTypeId)
        {
            cardTypeId = _cardTypeId;
            return this;
        }

        public CardDto build()
        {
            return new CardDto(this);
        }
    }
}
