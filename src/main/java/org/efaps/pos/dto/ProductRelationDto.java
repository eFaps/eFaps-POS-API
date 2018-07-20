/*
 * Copyright 2003 - 2018 The eFaps Team
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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(builder = ProductRelationDto.Builder.class)
public class ProductRelationDto
{
    private final String label;
    private final String productOid;

    protected ProductRelationDto(final Builder _builder)
    {
        this.label = _builder.label;
        this.productOid = _builder.productOid;
    }

    public String getLabel()
    {
        return this.label;
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
        private String label;
        private String productOid;

        public Builder withLabel(final String _label) {
            this.label = _label;
            return this;
        }

        public Builder withProductOid(final String _productOid) {
            this.productOid = _productOid;
            return this;
        }

        public ProductRelationDto build()
        {
            return new ProductRelationDto(this);
        }
    }
}
