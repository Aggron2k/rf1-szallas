package com.example.szallas.security;

import com.example.szallas.model.User;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;


@Data
public class SecurityUserDetails implements UserDetails {
    private String username;
    private String password;
    private boolean isEnabled;
    private List<GrantedAuthority> authorityList;

    public SecurityUserDetails(User user){
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.isEnabled = user.getEnabled();
        this.authorityList = List.of(new SimpleGrantedAuthority(user.getRole()));
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorityList;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }
}