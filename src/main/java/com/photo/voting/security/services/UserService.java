package com.photo.voting.security.services;

import com.photo.voting.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
