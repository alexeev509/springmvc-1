package com.ssu.service;

import com.ssu.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User generateUser() {
        return new User("Tony", 23);
    }
}
