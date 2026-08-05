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
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import tools.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = InventoryEntryDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InventoryEntryDto
{

    private final String oid;
    private final BigDecimal quantity;
    private final String warehouseOid;
    private final String productOid;
    private final OffsetDateTime updatedAt;

    private InventoryEntryDto(final Builder builder)
    {
        oid = builder.oid;
        quantity = builder.quantity;
        warehouseOid = builder.warehouseOid;
        productOid = builder.productOid;
        updatedAt = builder.updatedAt;
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

    public OffsetDateTime getUpdatedAt()
    {
        return updatedAt;
    }

    @Override
    public String toString()
    {
        final StringBuilder builder2 = new StringBuilder();
        builder2.append("InventoryEntryDto [oid=").append(oid)
                        .append(", quantity=").append(quantity)
                        .append(", warehouseOid=").append(warehouseOid)
                        .append(", productOid=").append(productOid)
                        .append(", updatedAt=").append(updatedAt)
                        .append("]");
        return builder2.toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
        extends AbstractObjectDto.Builder<Builder>
    {

        private String productOid;
        private String warehouseOid;
        private BigDecimal quantity;
        private String oid;
        private OffsetDateTime updatedAt;

        public Builder withOID(final String oid)
        {
            this.oid = oid;
            return this;
        }

        public Builder withQuantity(final BigDecimal quantity)
        {
            this.quantity = quantity;
            return this;
        }

        public Builder withProductOid(final String productOid)
        {
            this.productOid = productOid;
            return this;
        }

        public Builder withWarehouseOid(final String warehouseOid)
        {
            this.warehouseOid = warehouseOid;
            return this;
        }

        public Builder withUpdatedAt(final OffsetDateTime updatedAt)
        {
            this.updatedAt = updatedAt;
            return this;
        }

        public InventoryEntryDto build()
        {
            return new InventoryEntryDto(this);
        }
    }

}
