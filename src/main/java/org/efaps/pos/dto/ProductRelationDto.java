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

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = ProductRelationDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductRelationDto
{

    private final String label;
    private final String productOid;
    private final BigDecimal quantity;

    private final ProductRelationType type;

    protected ProductRelationDto(final Builder _builder)
    {
        label = _builder.label;
        quantity = _builder.quantity;
        productOid = _builder.productOid;
        type = _builder.type;
    }

    public String getLabel()
    {
        return label;
    }

    public BigDecimal getQuantity()
    {
        return quantity;
    }

    public String getProductOid()
    {
        return productOid;
    }

    public ProductRelationType getType()
    {
        return type;
    }

    @Override
    public String toString()
    {
        final StringBuilder builder2 = new StringBuilder();
        builder2.append("ProductRelationDto [label=").append(label).append(", productOid=").append(productOid)
                        .append(", quantity=").append(quantity).append(", type=").append(type).append("]");
        return builder2.toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
    {

        private String label;
        private BigDecimal quantity;
        private String productOid;
        private ProductRelationType type;

        public Builder withLabel(final String _label)
        {
            label = _label;
            return this;
        }

        public Builder withQuantity(final BigDecimal _quantity)
        {
            quantity = _quantity;
            return this;
        }

        public Builder withProductOid(final String _productOid)
        {
            productOid = _productOid;
            return this;
        }

        public Builder withType(final ProductRelationType _type)
        {
            type = _type;
            return this;
        }

        public ProductRelationDto build()
        {
            return new ProductRelationDto(this);
        }
    }
}
