/*
 * Copyright 2003 - 2022 The eFaps Team
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

import java.util.Map;
import java.util.ServiceLoader;

/**
 * Providers can be configured via {@link ServiceLoader}, i.e. by having a file
 * /META-INF/services/org.efaps.api.ui.ILogin in the class path root, with each line containing the
 * full class name of an {@link ICreditNoteListener}.
 *
 * The Interface IReceiptListener.
 */
public interface ICreditNoteListener
{
    /**
     * On create.
     *
     * @param _pos the pos
     * @param _invoice the invoice
     * @return the receipt
     */
    ICreditNote onCreate(IPos pos, ICreditNote creditNote, Map<String, String> map);
}