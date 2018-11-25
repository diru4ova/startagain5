package com.impl;

import com.entity.User;
import com.repo.UserRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class UserRepoImpl implements UserRepository {

    public UserRepoImpl() {
    }

    public UserRepoImpl(List<User> users) {
        this.users = users;
    }

    private List <User> users = new ArrayList<>();

    @Override
    public void addNewUser(User newUser) {
        users.add(newUser);

    }
    //method doesn't work. Cotroller sends null insted of username
    @Override
    public User findByUsername(String username) {

        User user =  new User("default", "default", "default", "default");

        for(User user1: users)
            if (user1.getUsername() == username) {

                user = user1;

                return user;
            }
        return user;
    }
}
