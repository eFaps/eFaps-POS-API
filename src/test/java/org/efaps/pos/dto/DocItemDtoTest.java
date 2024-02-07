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

import static org.testng.Assert.assertEquals;

import java.math.BigDecimal;

import org.testng.annotations.Test;

public class DocItemDtoTest
{
    @Test
    public void testBuilder() {

        final String oid = "1234.555";
        final BigDecimal crossPrice = new BigDecimal("1.11");
        final BigDecimal crossUnitPrice = new BigDecimal("1.12");
        final BigDecimal netPrice = new BigDecimal("1.13");
        final BigDecimal netUnitPrice = new BigDecimal("1.14");
        final String productOid = "1234.555";
        final Integer index = 22;
        final BigDecimal quantity = new BigDecimal("10");

        final DocItemDto dto = DocItemDto.builder()
            .withOID(oid)
            .withCrossPrice(crossPrice)
            .withCrossUnitPrice(crossUnitPrice)
            .withNetPrice(netPrice)
            .withNetUnitPrice(netUnitPrice)
            .withProductOid(productOid)
            .withIndex(index)
            .withQuantity(quantity)
            .build();

        assertEquals(dto.getOid(), oid);
        assertEquals(dto.getCrossPrice(), crossPrice);
        assertEquals(dto.getCrossUnitPrice(), crossUnitPrice);
        assertEquals(dto.getNetPrice(), netPrice) ;
        assertEquals(dto.getNetUnitPrice(), netUnitPrice);
        assertEquals(dto.getProductOid(), productOid);
        assertEquals(dto.getIndex(), index);
        assertEquals(dto.getQuantity(), quantity);
    }
}
