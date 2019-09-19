package org.efaps.pos.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Collections;
import java.util.Set;

@JsonDeserialize(builder = UserDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto
    extends AbstractObjectDto
{

    private final String username;

    private final String password;

    private final String firstName;

    private final String surName;

    private final Set<Roles> roles;

    private final Set<String> workspaceOids;

    private final boolean visible;

    private UserDto(final Builder _builder)
    {
        super(_builder);
        username = _builder.username;
        password = _builder.password;
        firstName = _builder.firstName;
        surName = _builder.surName;
        roles = _builder.roles == null ? Collections.emptySet() : Collections.unmodifiableSet(_builder.roles);
        workspaceOids = _builder.workspaceOids == null ? Collections.emptySet()
                        : Collections.unmodifiableSet(_builder.workspaceOids);
        visible = _builder.visible;
    }

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getSurName()
    {
        return surName;
    }

    public Set<Roles> getRoles()
    {
        return roles;
    }

    public Set<String> getWorkspaceOids()
    {
        return workspaceOids;
    }

    public boolean isVisible()
    {
        return visible;
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

        private boolean visible;

        public Builder withUsername(final String _username)
        {
            username = _username;
            return this;
        }

        public Builder withPassword(final String _password)
        {
            password = _password;
            return this;
        }

        public Builder withFirstName(final String _firstName)
        {
            firstName = _firstName;
            return this;
        }

        public Builder withSurName(final String _surName)
        {
            surName = _surName;
            return this;
        }

        public Builder withRoles(final Set<Roles> _roles)
        {
            roles = _roles;
            return this;
        }

        public Builder withWorkspaceOids(final Set<String> _workspaceOids)
        {
            workspaceOids = _workspaceOids;
            return this;
        }

        public Builder withVisible(final boolean _visible)
        {
            visible = _visible;
            return this;
        }

        @Override
        public UserDto build()
        {
            return new UserDto(this);
        }
    }
}
