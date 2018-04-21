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

import org.testng.annotations.Test;

public class ContactDtoTest
{
    @Test
    public void testBuilder() {
        final String taxnumber = "12345678901";
        final String name = "This is the name of this object";

        final ContactDto dto = ContactDto.builder()
            .withName(name)
            .withTaxNumber(taxnumber)
            .build();

        assertEquals(dto.getName(), name);
        assertEquals(dto.getTaxNumber(), taxnumber);
    }
}
