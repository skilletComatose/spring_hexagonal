package com.crud.crud.application.config;

import com.crud.crud.domain.model.gateways.UserGateway;
import com.crud.crud.domain.usecase.UserUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {


    @Bean
    public UserUseCase userUseCase(UserGateway userGateway){
        return  new UserUseCase(userGateway);
    }
}
