package org.efaps.pos.interfaces;

import java.math.BigDecimal;
import java.util.Set;

import org.efaps.pos.dto.TaxEntryDto;

public interface IItem
{

    Integer getIndex();

    BigDecimal getQuantity();

    BigDecimal getNetUnitPrice();

    BigDecimal getCrossPrice();

    BigDecimal getCrossUnitPrice();

    BigDecimal getNetPrice();

    Set<TaxEntryDto> getTaxes();

    String getSku();

    String getDescription();

    String getUoM();

}
