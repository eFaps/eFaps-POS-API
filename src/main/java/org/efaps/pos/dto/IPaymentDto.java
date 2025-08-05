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

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
                use = JsonTypeInfo.Id.NAME,
                include = JsonTypeInfo.As.EXISTING_PROPERTY,
                property = "type",
                visible = true
                )
        @JsonSubTypes({
            @JsonSubTypes.Type(value = PaymentCardDto.class, name = "CARD"),
            @JsonSubTypes.Type(value = PaymentCashDto.class, name = "CASH"),
            @JsonSubTypes.Type(value = PaymentChangeDto.class, name = "CHANGE"),
            @JsonSubTypes.Type(value = PaymentElectronicDto.class, name = "ELECTRONIC"),
            @JsonSubTypes.Type(value = PaymentFreeDto.class, name = "FREE"),
            @JsonSubTypes.Type(value = PaymentLoyaltyPointsDto.class, name = "LOYALTY_POINTS"),
            @JsonSubTypes.Type(value = PaymentRedeemCreditNoteDto.class, name = "REDEEM_CREDITNOTE"),
        })
public interface IPaymentDto
{
    int getIndex();
    PaymentType getType();
}
