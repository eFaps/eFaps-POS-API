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

import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = CalculatorRequestDto.Builder.class)
public class CalculatorRequestDto
{

    private final List<CalculatorPositionRequestDto> positions;

    private final String sourceDocIdent;

    private final boolean evaluateLoyalty;

    private final String contactOid;


    private CalculatorRequestDto(Builder builder)
    {
        this.positions = builder.positions;
        this.sourceDocIdent = builder.sourceDocIdent;
        this.evaluateLoyalty = builder.evaluateLoyalty;
        this.contactOid = builder.contactOid;
    }

    public List<CalculatorPositionRequestDto> getPositions()
    {
        return positions;
    }

    public String getSourceDocIdent()
    {
        return sourceDocIdent;
    }

    public boolean isEvaluateLoyalty()
    {
        return evaluateLoyalty;
    }

    public String getContactOid()
    {
        return contactOid;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append("CalculatorRequestDto [")
                        .append("sourceDocIdent=").append(sourceDocIdent)
                        .append(", evaluateLoyalty=").append(evaluateLoyalty)
                        .append(", contactOid=").append(contactOid)
                        .append(", positions=").append(positions)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
    {

        private List<CalculatorPositionRequestDto> positions = Collections.emptyList();
        private String sourceDocIdent;
        private boolean evaluateLoyalty;
        private String contactOid;

        private Builder()
        {
        }

        public Builder withPositions(List<CalculatorPositionRequestDto> positions)
        {
            this.positions = positions;
            return this;
        }

        public Builder withSourceDocIdent(String sourceDocIdent)
        {
            this.sourceDocIdent = sourceDocIdent;
            return this;
        }

        public Builder withEvaluateLoyalty(boolean evaluateLoyalty)
        {
            this.evaluateLoyalty = evaluateLoyalty;
            return this;
        }

        public Builder withContactOid(String contactOid)
        {
            this.contactOid = contactOid;
            return this;
        }

        public CalculatorRequestDto build()
        {
            return new CalculatorRequestDto(this);
        }
    }
}
