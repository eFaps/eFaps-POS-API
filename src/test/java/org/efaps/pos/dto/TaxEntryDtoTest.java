package org.efaps.pos.dto;

import static org.testng.Assert.assertEquals;

import java.math.BigDecimal;

import org.testng.annotations.Test;

public class TaxEntryDtoTest
{
    @Test
    public void testBuilder() {
        final BigDecimal amount = new BigDecimal("18");
        final TaxDto tax = TaxDto.builder().build();

        final TaxEntryDto dto = TaxEntryDto.builder()
            .withTax(tax)
            .withAmount(amount)
            .build();

        assertEquals(dto.getTax(), tax);
        assertEquals(dto.getAmount(), amount);
    }
}
