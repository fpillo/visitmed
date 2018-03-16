package com.visitmed.gateways;

import com.visitmed.models.Manager;

import java.util.Optional;
import java.util.UUID;

public interface ManagerGateway {

    Optional<Manager> findByUserId(UUID userId);

}
