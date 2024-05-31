package com.maider.article.infrastructure;

import com.maider.article.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<User, String> {
    User findByUsername(String username);
}
