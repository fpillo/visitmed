package com.visitmed.gateways.impl;

import com.visitmed.gateways.ManagerGateway;
import com.visitmed.gateways.ManagerRepository;
import com.visitmed.models.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
public class ManagerGatewayImpl implements ManagerGateway {

    private final ManagerRepository managerRepository;

    @Autowired
    public ManagerGatewayImpl(final ManagerRepository managerRepository) {
        this.managerRepository = managerRepository;
    }

    @Override
    public Optional<Manager> findByUserId(final UUID userId) {
        return Optional.ofNullable(managerRepository.findByUserId(userId));
    }
}
