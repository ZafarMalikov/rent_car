package com.example.rentcar2.user.entity;

import com.example.rentcar2.car.entity.Car;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

@Entity
@Table(name = "`user`")
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class User implements UserDetails {
    @Id
    private UUID id;

    @Column(unique = true)
    private String username;
    private String lastName;
    private String email;

    private String password;

    private String picture;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "user" ,cascade = CascadeType.REMOVE)
    private List<Car> car;



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
//        Set<SimpleGrantedAuthority> authoritySet=new HashSet<>();
//        for (Role role : roleList) {
//            for (Permission permission : role.getPermissions()) {
//                SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(permission.getCode());
//        authoritySet.add(simpleGrantedAuthority);
//            }
//        }
//        return authoritySet;
        return null;
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
        return true;
    }
}
