package com.photo.voting.security.services;

public interface SecurityService {
    boolean isAuthenticated();
    void autoLogin(String username, String password);
}