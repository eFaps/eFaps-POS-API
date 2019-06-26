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

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.math.BigDecimal;

@JsonDeserialize(builder = DiscountDto.Builder.class)
public class DiscountDto
{

    private final DiscountType type;

    private final BigDecimal value;

    private final String productOid;

    private final String label;

    private DiscountDto(final Builder _builder)
    {
        type = _builder.type;
        value = _builder.value;
        productOid = _builder.productOid;
        label = _builder.label;
    }

    public DiscountType getType()
    {
        return type;
    }

    public BigDecimal getValue()
    {
        return value;
    }

    public String getProductOid()
    {
        return productOid;
    }

    public String getLabel()
    {
        return label;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
    {

        private DiscountType type;
        private BigDecimal value;
        private String productOid;
        private String label;

        public Builder withType(final DiscountType _type) {
            type = _type;
            return this;
        }

        public Builder withValue(final BigDecimal _value) {
            value = _value;
            return this;
        }

        public Builder withProductOid(final String _productOid) {
            productOid = _productOid;
            return this;
        }

        public Builder withLabel(final String _label) {
            label = _label;
            return this;
        }

        public DiscountDto build()
        {
            return new DiscountDto(this);
        }
    }
}