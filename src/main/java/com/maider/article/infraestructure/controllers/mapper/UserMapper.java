package com.maider.article.infraestructure.controllers.mapper;

import com.maider.article.domain.entities.User;
import com.maider.article.domain.entities.dto.UserDTO;

public class UserMapper {
    public User toUser(UserDTO userDTO) {
        return new User(userDTO.getUsername(), userDTO.getRoles());
    }
}
