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
