package org.efaps.pos.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.math.BigDecimal;

@JsonDeserialize(builder = InventoryEntryDto.Builder.class)
public class InventoryEntryDto
{

    private final String id;
    private final String oid;
    private final BigDecimal quantity;
    private final String warehouseOid;
    private final String productOid;

    private InventoryEntryDto(final Builder _builder)
    {
        this.id = _builder.id;
        this.oid = _builder.oid;
        this.quantity = _builder.quantity;
        this.warehouseOid = _builder.warehouseOid;
        this.productOid = _builder.productOid;
    }

    public String getId()
    {
        return this.id;
    }

    public String getOid()
    {
        return this.oid;
    }

    public BigDecimal getQuantity()
    {
        return this.quantity;
    }

    public String getWarehouseOid()
    {
        return this.warehouseOid;
    }

    public String getProductOid()
    {
        return this.productOid;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
    {

        public String productOid;
        public String warehouseOid;
        public BigDecimal quantity;
        private String id;
        private String oid;

        public Builder withId(final String _id)
        {
            this.id = _id;
            return this;
        }

        public Builder withOID(final String _oid)
        {
            this.oid = _oid;
            return this;
        }

        public Builder withQuantity(final BigDecimal _quantity)
        {
            this.quantity = _quantity;
            return this;
        }

        public Builder withProductOid(final String _productOid)
        {
            this.productOid = _productOid;
            return this;
        }

        public Builder withWarehouse(final String _warehouseOid)
        {
            this.warehouseOid = _warehouseOid;
            return this;
        }

        public InventoryEntryDto build()
        {
            return new InventoryEntryDto(this);
        }
    }

}
