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

import org.testng.annotations.Test;

public class PosDtoTest
{
    @Test
    public void testBuilder() {
        final String oid = "1234.555";
        final String name = "This is the name of this object";
        final Currency currency = Currency.PEN;
        final String defaultContactOid = "5512.23";

        final PosDto dto = PosDto.builder()
            .withOID(oid)
            .withName(name)
            .withCurrency(currency)
            .withDefaultContactOid(defaultContactOid)
            .build();

        assertEquals(dto.getOid(), oid);
        assertEquals(dto.getName(), name);
        assertEquals(dto.getCurrency(), currency);
        assertEquals(dto.getDefaultContactOid(), defaultContactOid);
    }
}
