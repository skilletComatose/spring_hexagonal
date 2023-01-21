package com.crud.crud.domain.usecase;

import com.crud.crud.domain.model.User;
import com.crud.crud.domain.model.gateways.UserGateway;



import java.util.Optional;


public class UserUseCase {
    private final UserGateway userGateway;

    public UserUseCase(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User saveUser(User user){
        // aquí se puede hacer lógica de validaciones
        return userGateway.save(user);
    }

    public void deleteById(long id){
        this.userGateway.delete(id);
    }

    public Optional<User> findByid(long id){
        return this.userGateway.findById(id);
    }
}
