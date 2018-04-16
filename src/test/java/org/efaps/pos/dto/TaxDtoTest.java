package org.efaps.pos.dto;

import static org.testng.Assert.assertEquals;

import java.math.BigDecimal;

import org.testng.annotations.Test;

public class TaxDtoTest
{
    @Test
    public void testBuilder() {
        final String oid = "1134.5";
        final String name = "VAT";
        final BigDecimal percent = new BigDecimal("18");

        final TaxDto dto = TaxDto.builder()
            .withOID(oid)
            .withName(name)
            .withPercent(percent)
            .build();

        assertEquals(dto.getOid(), oid);
        assertEquals(dto.getName(), name);
        assertEquals(dto.getPercent(), percent);
    }
}
