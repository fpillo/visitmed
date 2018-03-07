package com.visitmed.gateways.impl;

import com.visitmed.gateways.UserGateway;
import com.visitmed.gateways.UserRepository;
import com.visitmed.models.User;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserGatewayImpl implements UserGateway {

    private final UserRepository userRepository;

    public UserGatewayImpl(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> findByUserName(final String userName) {
        return Optional.ofNullable(userRepository.findByUserName(userName));
    }

    @Override
    public User create(final User user) {
        return userRepository.save(user);
    }

    @Override
    public boolean existsByUserName(final String userName) {
        return userRepository.existsByUserName(userName);
    }
}
