package com.maider.article.infraestructure.kafka;

import com.maider.article.domain.entities.User;
import com.maider.article.domain.entities.dto.UserDTO;
import com.maider.article.domain.services.UserService;
import com.maider.article.infraestructure.mappers.UserMapper;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;


@Component
public class UserConsumer {
    @Autowired
    UserMapper mapper;
    @Autowired
    UserService userService;

    @KafkaListener(
            topics = "newUser",
            groupId = "userGroup",
            containerFactory = "kafkaListenerContainerFactory")
    public void userListener(@Payload @Valid UserDTO userDTO) {
        User user = mapper.toUser(userDTO);
        userService.save(user);
    }
}
