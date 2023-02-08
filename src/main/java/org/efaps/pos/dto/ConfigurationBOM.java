/*
 * Copyright 2003 - 2023 The eFaps Team
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

@JsonDeserialize(builder = ConfigurationBOM.Builder.class)
public class ConfigurationBOM
    extends AbstractObjectDto
{

    private final String bomGroupOid;

    private final int position;
    private final BigDecimal quantity;
    private final String uoM;

    private ConfigurationBOM(Builder builder)
    {
        super(builder);
        this.bomGroupOid = builder.bomGroupOid;
        this.position = builder.position;
        this.quantity = builder.quantity;
        this.uoM = builder.uoM;
    }

    public String getBomGroupOid()
    {
        return bomGroupOid;
    }

    public int getPosition()
    {
        return position;
    }

    public BigDecimal getQuantity()
    {
        return quantity;
    }

    public String getUoM()
    {
        return uoM;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", bomGroupOid=").append(bomGroupOid)
                        .append(", position=").append(position)
                        .append(", quantity=").append(quantity)
                        .append(", uoM=").append(uoM)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
        extends AbstractObjectDto.Builder<Builder, ConfigurationBOM>
    {

        private String bomGroupOid;
        private int position;
        private BigDecimal quantity;
        private String uoM;

        private Builder()
        {
        }

        public Builder withBomGroupOid(String bomGroupOid)
        {
            this.bomGroupOid = bomGroupOid;
            return this;
        }

        public Builder withPosition(int position)
        {
            this.position = position;
            return this;
        }

        public Builder withQuantity(BigDecimal quantity)
        {
            this.quantity = quantity;
            return this;
        }

        public Builder withUoM(String uoM)
        {
            this.uoM = uoM;
            return this;
        }

        @Override
        public ConfigurationBOM build()
        {
            return new ConfigurationBOM(this);
        }
    }
}
