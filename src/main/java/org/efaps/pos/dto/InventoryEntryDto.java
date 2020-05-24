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

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = InventoryEntryDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InventoryEntryDto
{

    private final String oid;
    private final BigDecimal quantity;
    private final String warehouseOid;
    private final String productOid;

    private InventoryEntryDto(final Builder _builder)
    {
        oid = _builder.oid;
        quantity = _builder.quantity;
        warehouseOid = _builder.warehouseOid;
        productOid = _builder.productOid;
    }

    public String getOid()
    {
        return oid;
    }

    public BigDecimal getQuantity()
    {
        return quantity;
    }

    public String getWarehouseOid()
    {
        return warehouseOid;
    }

    public String getProductOid()
    {
        return productOid;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
    {
        public String productOid;
        public String warehouseOid;
        public BigDecimal quantity;
        private String oid;

        public Builder withOID(final String _oid)
        {
            oid = _oid;
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

        public Builder withWarehouseOid(final String _warehouseOid)
        {
            warehouseOid = _warehouseOid;
            return this;
        }

        public InventoryEntryDto build()
        {
            return new InventoryEntryDto(this);
        }
    }

}
