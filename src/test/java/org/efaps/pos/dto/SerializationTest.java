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
import static org.testng.Assert.assertTrue;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

import tools.jackson.databind.ObjectMapper;



public class SerializationTest
{

    private ObjectMapper getObjectMapper() {
        final var objectMapper = new ObjectMapper();
        return objectMapper;
    }

    private PaymentCashDto getPaymentCashDto() {
        return  new PaymentCashDto.Builder()
                        .withOid("123.456")
                        .withAmount(new BigDecimal("12.56"))
                        .withCurrency(Currency.PEN)
                        .withExchangeRate(BigDecimal.ONE)
                        .build();
    }


    private PaymentLoyaltyPointsDto getPaymentLoyaltyPointsDto() {
        return PaymentLoyaltyPointsDto.builder()
                        .withOid("123.456")
                        .withAmount(new BigDecimal("12.56"))
                        .withCurrency(Currency.PEN)
                        .withExchangeRate(BigDecimal.ONE)
                        .build();
    }

    private PaymentElectronicDto getPaymentElectronicDto() {
        return  PaymentElectronicDto.builder()
                        .withOid("123.456")
                        .withAmount(new BigDecimal("12.56"))
                        .withCurrency(Currency.PEN)
                        .withExchangeRate(BigDecimal.ONE)
                        .withMappingKey("MAPPINGKEY")
                        .withServiceProvider("IZIPP")
                        .withEquipmentIdent("08-15")
                        .withAuthorization("888888")
                        .withOperationId("12365465")
                        .withOperationDateTime(OffsetDateTime.now())
                        .withCardLabel("VISA")
                        .withCardNumber("1234657898987")
                        .withInfo("the info field")
                        .build();
    }

    @Test
    public void testPaymentCash()  {

        final var dto = getPaymentCashDto();
        final var objectMapper =  getObjectMapper();
        final var json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(dto);
        System.out.println(json);
        final var payment = objectMapper.readValue(json, IPaymentDto.class);
        System.out.println(payment);
        assertTrue(payment instanceof PaymentCashDto);
        assertEquals(payment.getType(), PaymentType.CASH);

        final var paymentDto = (PaymentCashDto) payment;
        assertEquals(paymentDto.getType(), paymentDto.getType());
        assertEquals(paymentDto.getAmount(), paymentDto.getAmount());
        assertEquals(paymentDto.getCurrency(), paymentDto.getCurrency());
        assertEquals(paymentDto.getExchangeRate(), paymentDto.getExchangeRate());
    }

    @Test
    public void testPaymentLoyaltyPoints() {

        final var dto = getPaymentLoyaltyPointsDto();
        final var objectMapper =  getObjectMapper();
        final var json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(dto);
        System.out.println(json);
        final var payment = objectMapper.readValue(json, IPaymentDto.class);
        System.out.println(payment);
        assertTrue(payment instanceof PaymentLoyaltyPointsDto);
        assertEquals(payment.getType(), PaymentType.LOYALTY_POINTS);

        final var paymentDto = (PaymentLoyaltyPointsDto) payment;
        assertEquals(paymentDto.getType(), paymentDto.getType());
        assertEquals(paymentDto.getAmount(), paymentDto.getAmount());
        assertEquals(paymentDto.getCurrency(), paymentDto.getCurrency());
        assertEquals(paymentDto.getExchangeRate(), paymentDto.getExchangeRate());
    }

    @Test
    public void testPaymentElectronics() {

        final var dto = getPaymentElectronicDto();

        final var objectMapper =  getObjectMapper();
        final var json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(dto);
        System.out.println(json);
        final var payment = objectMapper.readValue(json, IPaymentDto.class);
        System.out.println(payment);
        assertTrue(payment instanceof PaymentElectronicDto);
        assertEquals(payment.getType(), PaymentType.ELECTRONIC);

        final var paymentDto = (PaymentElectronicDto) payment;
        assertEquals(paymentDto.getType(), paymentDto.getType());
        assertEquals(paymentDto.getAmount(), paymentDto.getAmount());
        assertEquals(paymentDto.getCurrency(), paymentDto.getCurrency());
        assertEquals(paymentDto.getExchangeRate(), paymentDto.getExchangeRate());
    }


    @Test
    public void testDocument() {

        final ReceiptDto dto = ReceiptDto.builder()
                        .withId("absgctagd")
                        .withOid("123.15")
                        .withNumber("001-001651")
                        .withStatus(DocStatus.OPEN)
                        .withItems(Collections.singleton(DocItemDto.builder().build()))
                        .withPayments(List.of(getPaymentElectronicDto(), getPaymentCashDto(), getPaymentLoyaltyPointsDto()))
                        .withNetTotal(new BigDecimal("11.2"))
                        .withCrossTotal(new BigDecimal("13.41"))
                        .withTaxes(Collections.singleton(TaxEntryDto.builder().build()))
                        .build();
        final var objectMapper =  getObjectMapper();
        final var json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(dto);
        System.out.println(json);
        final var receiptDto = objectMapper.readValue(json, ReceiptDto.class);
        System.out.println(receiptDto);
    }

}
