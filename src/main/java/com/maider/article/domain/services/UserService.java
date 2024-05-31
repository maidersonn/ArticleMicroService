package com.maider.article.domain.services;

import com.maider.article.domain.entities.User;
import com.maider.article.domain.repositories.UserRepositoy;
import com.maider.article.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepositoy userRepositoy;
    public User getUser(String username) {
        return userRepositoy.findByUsername(username);
    }
}