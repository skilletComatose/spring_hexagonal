package com.crud.crud.infraestructure.driver_adapter.jpa_repository;

import com.crud.crud.domain.model.User;
import com.crud.crud.domain.model.gateways.UserGateway;
import com.crud.crud.infraestructure.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserGatewayImpl implements UserGateway {
    private final UserMapper userMapper;
    private final UserDataRepository userDataRepository;

    @Override
    public User save(User user) {
        UserData ud = userMapper.toUserData(user);
        return userMapper.toUser(userDataRepository.save(ud));
    }

    @Override
    public void delete(long id) {
        userDataRepository.deleteById(id);
    }

    @Override
    public Optional<User> findById(long id) {
        return userDataRepository.findById(id)
                .map(userMapper::toUser);
    }
}
