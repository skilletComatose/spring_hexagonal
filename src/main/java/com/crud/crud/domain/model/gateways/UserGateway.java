package com.crud.crud.domain.model.gateways;

import com.crud.crud.domain.model.User;

import java.util.Optional;

public interface UserGateway {
    User save(User user);
    void delete(long id);

    Optional<User> findById(long id);
}
