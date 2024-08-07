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

import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = PromoInfoSyncDto.Builder.class)
public class PromoInfoSyncDto
{

    private final String documentOid;
    private final PromoInfoDto promoInfo;
    private final List<String> promotions;

    private PromoInfoSyncDto(Builder builder)
    {
        this.documentOid = builder.documentOid;
        this.promoInfo = builder.promoInfo;
        this.promotions = builder.promotions;
    }

    public String getDocumentOid()
    {
        return documentOid;
    }

    public PromoInfoDto getPromoInfo()
    {
        return promoInfo;
    }

    public List<String> getPromotions()
    {
        return promotions;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
    {

        private String documentOid;
        private PromoInfoDto promoInfo;
        private List<String> promotions = Collections.emptyList();

        private Builder()
        {
        }

        public Builder withDocumentOid(String documentOid)
        {
            this.documentOid = documentOid;
            return this;
        }

        public Builder withPromoInfo(PromoInfoDto promoInfo)
        {
            this.promoInfo = promoInfo;
            return this;
        }

        public Builder withPromotions(List<String> promotions)
        {
            this.promotions = promotions;
            return this;
        }

        public PromoInfoSyncDto build()
        {
            return new PromoInfoSyncDto(this);
        }
    }
}
