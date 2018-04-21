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

import org.testng.annotations.Test;

public class OrderDtoTest
{
    @Test
    public void testBuilder() {
        final String id = "absgctagd";
        final String oid = "1234.555";
        final String number = "001-001651";
        final BigDecimal netTotal = new BigDecimal("11.2");
        final BigDecimal crossTotal = new BigDecimal("11.2");

        final OrderDto dto = OrderDto.builder()
            .withId(id)
            .withOID(oid)
            .withNumber(number)
            .withStatus(DocStatus.OPEN)
            .withItems(Collections.singleton(DocItemDto.builder().build()))
            .withNetTotal(netTotal)
            .withCrossTotal(crossTotal)
            .withTaxes(Collections.singleton(TaxEntryDto.builder().build()))
            .build();

        assertEquals(dto.getId(), id);
        assertEquals(dto.getOid(), oid);
        assertEquals(dto.getNumber(), number);
        assertEquals(dto.getStatus(), DocStatus.OPEN);
        assertEquals(dto.getNetTotal(), netTotal);
        assertEquals(dto.getCrossTotal(), crossTotal);
        assertEquals(dto.getItems().size(), 1) ;
        assertEquals(dto.getTaxes().size(), 1);
    }

    @Test
    public void testBuilderNUll() {

        final ReceiptDto dto = ReceiptDto.builder()
            .withItems(null)
            .withPayments(null)
            .withTaxes(null)
            .build();

        assertEquals(dto.getItems().size(), 0) ;
        assertEquals(dto.getPayments().size(), 0);
        assertEquals(dto.getTaxes().size(), 0);
    }
}
