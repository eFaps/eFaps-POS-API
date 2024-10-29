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

import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = OrderDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderDto
    extends AbstractDocumentDto
{

    private final String payableOid;

    private final String orderOptionKey;

    public OrderDto(final Builder builder)
    {
        super(builder);
        this.payableOid = builder.payableOid;
        this.orderOptionKey = builder.orderOptionKey;
    }

    public String getPayableOid()
    {
        return payableOid;
    }

    public String getOrderOptionKey()
    {
        return orderOptionKey;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", payableOid=").append(payableOid)
                        .append(", orderOptionKey=").append(orderOptionKey)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder
        extends AbstractDocumentDto.Builder<Builder, OrderDto>
    {

        private String payableOid;

        private String orderOptionKey;

        public Builder withPayableOid(final String payableOid)
        {
            this.payableOid = payableOid;
            return this;
        }

        public Builder withOrderOptionKey(final String orderOptionKey)
        {
            this.orderOptionKey = orderOptionKey;
            return this;
        }

        public Builder withItems(final Collection<DocItemDto> _items)
        {
            setItems(_items);
            return this;
        }

        @Override
        public OrderDto build()
        {
            return new OrderDto(this);
        }
    }
}
