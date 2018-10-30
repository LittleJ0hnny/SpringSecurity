package com.littlejohnny.auth.service;

import com.littlejohnny.auth.model.Authority;
import com.littlejohnny.auth.model.Client;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ClientService implements ClientDetailsService {
    @Override
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
        Set<String> scopes = new HashSet<>();
        Set<String> authorizationGrantTypes = new HashSet<>();
        Set<String> registegerRedirectUri = new HashSet<>();
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new Authority("ADMIN"));
        scopes.add("myscope");
        authorizationGrantTypes.add("authorization_code");
        authorizationGrantTypes.add("password");
        authorizationGrantTypes.add("refresh_token");
        registegerRedirectUri.add("http://localhost:8080/");
        return new Client("client-id", "client-secret", scopes, authorizationGrantTypes, registegerRedirectUri, authorities, 120, 1800);
    }
}
