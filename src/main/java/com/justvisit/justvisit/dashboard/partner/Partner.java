package com.justvisit.justvisit.dashboard.partner;

import com.sun.istack.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Collection;
import java.util.Collections;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
public class Partner implements UserDetails {

    @Id
    @SequenceGenerator(
            name = "partner_sequence",
            sequenceName = "partner_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "partner_sequence"
    )
    private Long id;

    @NotNull
    @Size(min = 1, max = 25)
    @Pattern(regexp = "^[a-zA-Z]+(?:\\s+[a-zA-Z]+)*$")
    private String firstName;

    @NotNull
    @Size(min = 1, max = 25)
    @Pattern(regexp = "^[a-zA-Z]+(?:\\s+[a-zA-Z]+)*$")
    private String lastName;

    private String email;

    @NotNull
    @Size(min = 4)
    private String password;

//    @Enumerated(EnumType.STRING)
    private UUID partnerRole;

    private Boolean locked = false;

    private Boolean enabled = false;


    public Partner(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.partnerRole = UUID.randomUUID();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(PartnerRole.ADMIN_PARTNER.name());
        return Collections.singleton(authority);
    }

    @Override
    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !locked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}
