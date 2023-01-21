package com.crud.crud.infraestructure.mapper;

import com.crud.crud.domain.model.User;
import com.crud.crud.infraestructure.driver_adapter.jpa_repository.UserData;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class UserMapper {
    public User toUser(UserData userData){
        return User.builder()
                .name(userData.getName())
                .lastname(userData.getLastname())
                .email(userData.getEmail())
                .identifier(userData.getIdentifier())
                .build();
    }

    public UserData toUserData(User user){
        return UserData.builder()
                .name(user.getName())
                .lastname(user.getLastname())
                .email(user.getEmail())
                .identifier(user.getIdentifier())
                .build();
    }
}
