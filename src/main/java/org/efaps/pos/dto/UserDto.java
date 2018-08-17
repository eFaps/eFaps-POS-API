package org.efaps.pos.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Collections;
import java.util.Set;

@JsonDeserialize(builder = UserDto.Builder.class)
public class UserDto
    extends AbstractObjectDto
{

    private final String username;

    private final String password;

    private final String firstName;

    private final String surName;

    private final Set<Roles> roles;

    private final Set<String> workspaceOids;

    private UserDto(final Builder _builder)
    {
        super(_builder);
        this.username = _builder.username;
        this.password = _builder.password;
        this.firstName = _builder.firstName;
        this.surName = _builder.surName;
        this.roles = _builder.roles == null ? Collections.emptySet() : Collections.unmodifiableSet(_builder.roles);
        this.workspaceOids = _builder.workspaceOids == null ? Collections.emptySet()
                        : Collections.unmodifiableSet(_builder.workspaceOids);
    }

    public String getUsername()
    {
        return this.username;
    }

    public String getPassword()
    {
        return this.password;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getSurName()
    {
        return this.surName;
    }

    public Set<Roles> getRoles()
    {
        return this.roles;
    }

    public Set<String> getWorkspaceOids()
    {
        return this.workspaceOids;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
        extends AbstractObjectDto.Builder<Builder, UserDto>
    {

        private String username;

        private String password;

        private String firstName;

        private String surName;

        private Set<Roles> roles;

        private Set<String> workspaceOids;

        public Builder withUsername(final String _username)
        {
            this.username = _username;
            return this;
        }

        public Builder withPassword(final String _password)
        {
            this.password = _password;
            return this;
        }

        public Builder withFirstName(final String _firstName)
        {
            this.firstName = _firstName;
            return this;
        }

        public Builder withSurName(final String _surName)
        {
            this.surName = _surName;
            return this;
        }

        public Builder withRoles(final Set<Roles> _roles)
        {
            this.roles = _roles;
            return this;
        }

        public Builder withWorkspaceOids(final Set<String> _workspaceOids)
        {
            this.workspaceOids = _workspaceOids;
            return this;
        }

        @Override
        public UserDto build()
        {
            return new UserDto(this);
        }
    }
}
