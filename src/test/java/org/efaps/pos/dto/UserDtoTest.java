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

import java.util.Collections;
import java.util.Set;

import org.testng.annotations.Test;

public class UserDtoTest
{
    @Test
    public void testBuilder()
    {
        final String oid = "7434.5";
        final String firstName = "firstName";
        final String password = "password";
        final String surname = "surname";
        final String username = "Username";
        final Set<Roles> roles = Collections.singleton(Roles.ADMIN);
        final UserDto dto = UserDto.builder()
            .withOID(oid)
            .withFirstName(firstName)
            .withPassword(password)
            .withRoles(roles)
            .withSurName(surname)
            .withUsername(username)
            .build();

        assertEquals(dto.getOid(), oid);
        assertEquals(dto.getFirstName(), firstName);
        assertEquals(dto.getPassword(), password);
        assertEquals(dto.getSurName(), surname);
        assertEquals(dto.getUsername(), username);
        assertEquals(dto.getRoles(), roles);
    }
}
