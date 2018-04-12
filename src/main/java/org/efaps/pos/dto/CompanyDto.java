package org.efaps.pos.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = CompanyDto.Builder.class)
public class CompanyDto
{
    private final String name;
    private final String taxNumber;

    private CompanyDto(final Builder _builder) {
        this.name = _builder.name;
        this.taxNumber = _builder.taxNumber;
    }

    public String getName()
    {
        return this.name;
    }

    public String getTaxNumber()
    {
        return this.taxNumber;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    /**
     * Builder to build {@link AgendaDto}.
     */
    public static final class Builder {

        private String name;
        private String taxNumber;

        public Builder withName(final String _name) {
            this.name = _name;
            return this;
        }

        public Builder withTaxNumber(final String _taxNumber) {
            this.taxNumber = _taxNumber;
            return this;
        }

        public CompanyDto build()
        {
            return new CompanyDto(this);
        }
    }
}
