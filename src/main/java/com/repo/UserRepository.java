package com.repo;

import com.entity.User;


public interface UserRepository {

    void addNewUser(User newUser);
    User findByUsername(String username);

}
