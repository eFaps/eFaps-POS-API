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

package org.efaps.pos.interfaces;

import java.util.ServiceLoader;

import org.efaps.pos.dto.PosDto;

/**
 * Providers can be configured via {@link ServiceLoader}, i.e. by having a file
 * /META-INF/services/org.efaps.api.ui.ILogin in the class path root, with each line containing the
 * full class name of an {@link IReceiptListener}.
 *
 * The Interface IReceiptListener.
 */
public interface IReceiptListener
{
    /**
     * On create.
     *
     * @param _posDto the pos dto
     * @param _receipt the receipt
     * @return the receipt dto
     */
    IReceipt onCreate(PosDto _posDto, IReceipt _receipt);
}
