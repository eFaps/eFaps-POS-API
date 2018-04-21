package org.efaps.pos.interfaces;

import java.math.BigDecimal;

public interface IItem
{

    Integer getIndex();

    BigDecimal getQuantity();

    BigDecimal getNetUnitPrice();

    BigDecimal getCrossPrice();

    BigDecimal getCrossUnitPrice();

    BigDecimal getNetPrice();

    String getSku();

    String getDescription();

    String getUoM();

}
