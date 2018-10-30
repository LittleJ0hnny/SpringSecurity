package com.littlejohnny.auth.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.provider.ClientDetails;

import java.util.*;

public class Client implements ClientDetails {

    private String clientId;

    private Set<String> resourceIds;

    private boolean isSecretRequired;

    private String clientSecret;

    private boolean isScoped;

    private Set<String> scope;

    private Set<String> authorizeGrantTypes;

    private Set<String> registegerRedirectUri;

    private List<GrantedAuthority> authorities;

    private Integer accessTokenValiditySeconds;

    private Integer refreshTokenValiditySeconds;

    private boolean isAutoApprove;

    public Client() {
    }

    public Client(String clientId, String clientSecret, Set<String> scope, Set<String> authorizeGrantTypes, Set<String> registegerRedirectUri, List<GrantedAuthority> authorities, Integer accessTokenValiditySeconds, Integer refreshTokenValiditySeconds) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.scope = scope;
        this.authorizeGrantTypes = authorizeGrantTypes;
        this.registegerRedirectUri = registegerRedirectUri;
        this.authorities = authorities;
        this.accessTokenValiditySeconds = accessTokenValiditySeconds;
        this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
        this.resourceIds = new HashSet<>();
        this.isSecretRequired = true;
        this.isScoped = true;
        this.isAutoApprove = true;
    }

    @Override
    public String getClientId() {
        return this.clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @Override
    public Set<String> getResourceIds() {
        return this.resourceIds;
    }

    public void setResourceIds(Set<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    @Override
    public boolean isSecretRequired() {
        return this.isSecretRequired;
    }

    public void setSecretRequired(boolean secretRequired) {
        isSecretRequired = secretRequired;
    }

    @Override
    public String getClientSecret() {
        return this.clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    @Override
    public boolean isScoped() {
        return this.isScoped;
    }

    public void setScoped(boolean scoped) {
        isScoped = scoped;
    }

    @Override
    public Set<String> getScope() {
        return this.scope;
    }

    public void setScope(Set<String> scope) {
        this.scope = scope;
    }

    @Override
    public Set<String> getAuthorizedGrantTypes() {
        return this.authorizeGrantTypes;
    }

    public void setAuthorizeGrantTypes(Set<String> authorizeGrantTypes) {
        this.authorizeGrantTypes = authorizeGrantTypes;
    }

    @Override
    public Set<String> getRegisteredRedirectUri() {
        return this.registegerRedirectUri;
    }

    public void setRegistegerRedirectUri(Set<String> registegerRedirectUri) {
        this.registegerRedirectUri = registegerRedirectUri;
    }

    @Override
    public Collection<GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    public void setAuthorities(List<GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    @Override
    public Integer getAccessTokenValiditySeconds() {
        return this.accessTokenValiditySeconds;
    }

    public void setAccessTokenValiditySeconds(Integer accessTokenValiditySeconds) {
        this.accessTokenValiditySeconds = accessTokenValiditySeconds;
    }

    @Override
    public Integer getRefreshTokenValiditySeconds() {
        return this.refreshTokenValiditySeconds;
    }

    public void setRefreshTokenValiditySeconds(Integer refreshTokenValiditySeconds) {
        this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
    }

    @Override
    public boolean isAutoApprove(String scope) {
        return this.isAutoApprove;
    }

    public void setAutoApprove(boolean autoApprove) {
        isAutoApprove = autoApprove;
    }

    @Override
    public Map<String, Object> getAdditionalInformation() {
        return new HashMap<>();
    }
}
