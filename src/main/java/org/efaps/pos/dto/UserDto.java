package org.efaps.pos.dto;

import java.util.Collection;
import java.util.Collections;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = UserDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto
    extends AbstractObjectDto
{

    private final String username;

    private final String password;

    private final String employeeOid;

    private final String firstName;

    private final String surName;

    private final Collection<Roles> roles;

    private final Collection<String> workspaceOids;

    private final Collection<Permission> permissions;

    private final boolean visible;

    private UserDto(Builder builder)
    {
        super(builder);
        username = builder.username;
        password = builder.password;
        employeeOid = builder.employeeOid;
        firstName = builder.firstName;
        surName = builder.surName;
        visible = builder.visible;
        roles = builder.roles == null ? Collections.emptySet() : Collections.unmodifiableCollection(builder.roles);
        permissions = builder.permissions == null ? Collections.emptySet()
                        : Collections.unmodifiableCollection(builder.permissions);
        workspaceOids = builder.workspaceOids == null ? Collections.emptySet()
                        : Collections.unmodifiableCollection(builder.workspaceOids);
    }

    public String getUsername()
    {
        return username;
    }

    public String getEmployeeOid()
    {
        return employeeOid;
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

    public Collection<Roles> getRoles()
    {
        return roles;
    }

    public Collection<String> getWorkspaceOids()
    {
        return workspaceOids;
    }

    public Collection<Permission> getPermissions()
    {
        return permissions;
    }

    public boolean isVisible()
    {
        return visible;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", username=").append(username)
                        .append(", password=").append("****")
                        .append(", firstName=").append(firstName)
                        .append(", surName=").append(surName)
                        .append(", roles=").append(roles)
                        .append(", permissions=").append(permissions)
                        .append(", workspaceOids=").append(workspaceOids)
                        .append(", visible=").append(visible)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
        extends AbstractObjectDto.Builder<Builder, UserDto>
    {

        private String username;

        private String password;

        private String employeeOid;

        private String firstName;

        private String surName;

        private Collection<Roles> roles;

        private Collection<String> workspaceOids;

        private boolean visible;

        private Collection<Permission> permissions = Collections.emptyList();

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

        public Builder withEmployeeOid(final String employeeOid)
        {
            this.employeeOid = employeeOid;
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

        public Builder withRoles(final Collection<Roles> _roles)
        {
            roles = _roles;
            return this;
        }

        public Builder withWorkspaceOids(final Collection<String> _workspaceOids)
        {
            workspaceOids = _workspaceOids;
            return this;
        }

        public Builder withVisible(final boolean _visible)
        {
            visible = _visible;
            return this;
        }

        public Builder withPermissions(Collection<Permission> permissions)
        {
            this.permissions = permissions;
            return this;
        }

        @Override
        public UserDto build()
        {
            return new UserDto(this);
        }
    }

}
