package com.maider.article.infrastructure;

import com.maider.article.domain.entities.User;
import com.maider.article.domain.repositories.UserRepositoy;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRepositoryImplementation implements UserRepositoy {
    @Autowired
    private JpaUserRepository jpaUserRepository;
    @Override
    public User findByUsername(String username) {
        return jpaUserRepository.findByUsername(username);
    }
}
