package com.littlejohnny.auth.service;

import com.littlejohnny.auth.model.Authority;
import com.littlejohnny.auth.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new User("Ostap", "ostap@gmail.com", "password", Arrays.asList(new Authority("ADMIN")));
    }
}
