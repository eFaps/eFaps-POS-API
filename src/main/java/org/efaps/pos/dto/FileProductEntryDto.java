package org.efaps.pos.dto;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = FileProductEntryDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FileProductEntryDto
{

    private final String productOid;

    @Generated("SparkTools")
    private FileProductEntryDto(Builder builder)
    {
        this.productOid = builder.productOid;
    }

    public String getProductOid()
    {
        return productOid;
    }

    @Generated("SparkTools")
    public static Builder builder()
    {
        return new Builder();
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(this.getClass().getName())
                        .append(" [productOid=").append(productOid)
                        .append("]").toString();
    }

    @Generated("SparkTools")
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
    {

        private String productOid;

        private Builder()
        {
        }

        public Builder withProductOid(String productOid)
        {
            this.productOid = productOid;
            return this;
        }

        public FileProductEntryDto build()
        {
            return new FileProductEntryDto(this);
        }
    }
}
