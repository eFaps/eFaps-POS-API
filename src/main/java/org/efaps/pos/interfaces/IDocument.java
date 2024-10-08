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
package org.efaps.pos.interfaces;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collection;

import org.efaps.pos.dto.ContactDto;
import org.efaps.pos.dto.Currency;
import org.efaps.pos.dto.EmployeeRelationDto;
import org.efaps.pos.dto.TaxEntryDto;

public interface IDocument
{
    String getNumber();

    LocalDate getDate();

    BigDecimal getCrossTotal();

    BigDecimal getNetTotal();

    BigDecimal getExchangeRate();

    BigDecimal getPayableAmount();

    Collection<TaxEntryDto> getTaxes();

    Currency getCurrency();

    ContactDto getContact();

    Collection<EmployeeRelationDto> getEmployeeRelations();
}
