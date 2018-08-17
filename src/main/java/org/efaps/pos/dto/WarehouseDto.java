package org.efaps.pos.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = WarehouseDto.Builder.class)
public class WarehouseDto
    extends AbstractObjectDto
{

    private final String name;

    private WarehouseDto(final Builder _builder)
    {
        super(_builder);
        this.name = _builder.name;
    }

    public String getName()
    {
        return this.name;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
        extends AbstractObjectDto.Builder<Builder, WarehouseDto>
    {

        private String name;

        public Builder withName(final String _name)
        {
            this.name = _name;
            return this;
        }

        @Override
        public WarehouseDto build()
        {
            return new WarehouseDto(this);
        }
    }
}
