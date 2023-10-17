package org.efaps.pos.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = GenerateDocResponseDto.Builder.class)
public class GenerateDocResponseDto
{

    private final String oid;
    private final Currency currency;
    private final BigDecimal payableAmount;

    private GenerateDocResponseDto(Builder builder)
    {
        this.oid = builder.oid;
        this.currency = builder.currency;
        this.payableAmount = builder.payableAmount;
    }

    public String getOid()
    {
        return oid;
    }

    public Currency getCurrency()
    {
        return currency;
    }

    public BigDecimal getPayableAmount()
    {
        return payableAmount;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", oid=").append(oid)
                        .append(", currency=").append(currency)
                        .append(", payableAmount=").append(payableAmount)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
    {

        private String oid;
        private Currency currency;
        private BigDecimal payableAmount;

        private Builder()
        {
        }

        public Builder withOid(String oid)
        {
            this.oid = oid;
            return this;
        }

        public Builder withCurrency(Currency currency)
        {
            this.currency = currency;
            return this;
        }

        public Builder withPayableAmount(BigDecimal payableAmount)
        {
            this.payableAmount = payableAmount;
            return this;
        }

        public GenerateDocResponseDto build()
        {
            return new GenerateDocResponseDto(this);
        }
    }
}
