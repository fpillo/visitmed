package com.visitmed.gateways;

import com.visitmed.models.User;

import java.util.Optional;

public interface UserGateway {

    Optional<User> findEnabledByEmail(String email);

}
