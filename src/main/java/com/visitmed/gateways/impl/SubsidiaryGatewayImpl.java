package com.visitmed.gateways.impl;

import com.visitmed.gateways.SubsidiaryGateway;
import com.visitmed.gateways.SubsidiaryRepository;
import com.visitmed.models.Subsidiary;
import com.visitmed.models.User;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
public class SubsidiaryGatewayImpl implements SubsidiaryGateway {

    private final SubsidiaryRepository subsidiaryRepository;

    public SubsidiaryGatewayImpl(final SubsidiaryRepository subsidiaryRepository) {
        this.subsidiaryRepository = subsidiaryRepository;
    }

    @Override
    public Optional<Subsidiary> findByManagerId(final UUID managerId) {
        return Optional.ofNullable(subsidiaryRepository.findByManagerId(managerId));
    }
}
