package org.efaps.pos.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = WarehouseDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class WarehouseDto
    extends AbstractObjectDto
{

    private final String name;

    private WarehouseDto(final Builder _builder)
    {
        super(_builder);
        name = _builder.name;
    }

    public String getName()
    {
        return name;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
        extends AbstractObjectDto.Builder<Builder, WarehouseDto>
    {

        private String name;

        public Builder withName(final String _name)
        {
            name = _name;
            return this;
        }

        @Override
        public WarehouseDto build()
        {
            return new WarehouseDto(this);
        }
    }
}
