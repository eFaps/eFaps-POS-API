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

import java.util.Collections;

import org.testng.annotations.Test;

public class RecieptDtoTest
{
    @Test
    public void testBuilder() {
        final String id = "absgctagd";
        final String oid = "1234.555";
        final String number = "001-001651";

        final ReceiptDto dto = ReceiptDto.builder()
            .withId(id)
            .withOID(oid)
            .withNumber(number)
            .withStatus(DocStatus.OPEN)
            .withItems(Collections.singleton(DocItemDto.builder().build()))
            .withPayments(Collections.singleton(PaymentDto.builder().build()))
            .build();

        assertEquals(dto.getId(), id);
        assertEquals(dto.getOid(), oid);
        assertEquals(dto.getNumber(), number);
        assertEquals(dto.getStatus(), DocStatus.OPEN);
        assertEquals(dto.getItems().size(), 1) ;
        assertEquals(dto.getPayments().size(), 1);
    }
}
