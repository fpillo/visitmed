package com.visitmed.gateways;

import com.visitmed.models.User;

import java.util.Optional;

public interface UserGateway {

    Optional<User> findByUserName(String userName);

    User create(User user);

    boolean existsByUserName(String userName);

}
