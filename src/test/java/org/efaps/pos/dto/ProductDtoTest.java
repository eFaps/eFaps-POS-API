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

import static org.testng.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Set;

import org.testng.annotations.Test;

public class ProductDtoTest
{
    @Test
    public void testBuilder() {
        final String oid = "1234.555";
        final String description = "This is the name of this object";
        final Set<String> categoryOids = Collections.singleton("565.25");
        final BigDecimal crossPrice = new BigDecimal("12.26");
        final BigDecimal netPrice = new BigDecimal("14.26");
        final String sku = "12222.0001";
        final String imageOid = "8234.555";
        final Set<TaxDto> taxes = Collections.singleton(TaxDto.builder().build());

        final ProductDto dto = ProductDto.builder()
            .withOID(oid)
            .withDescription(description)
            .withImageOid(imageOid)
            .withCategoryOids(categoryOids)
            .withCrossPrice(crossPrice)
            .withNetPrice(netPrice)
            .withSKU(sku)
            .withTaxes(taxes)
            .build();

        assertEquals(dto.getOid(), oid);
        assertEquals(dto.getDescription(), description);
        assertEquals(dto.getImageOid(), imageOid);
        assertEquals(dto.getCategoryOids(), categoryOids);
        assertEquals(dto.getCrossPrice(), crossPrice);
        assertEquals(dto.getNetPrice(), netPrice);
        assertEquals(dto.getSku(), sku);
        assertEquals(dto.getTaxes(), taxes);
    }

    @Test
    public void testBuilderEmptyCollections() {
        final ProductDto dto = ProductDto.builder()
                        .withCategoryOids(null)
                        .withTaxes(null)
                        .build();

        assertEquals(dto.getCategoryOids().size(), 0);
        assertEquals(dto.getTaxes().size(), 0);
    }
}
