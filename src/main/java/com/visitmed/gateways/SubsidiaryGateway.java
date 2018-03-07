package com.visitmed.gateways;

import com.visitmed.models.Subsidiary;
import com.visitmed.models.User;

import java.util.Optional;
import java.util.UUID;

public interface SubsidiaryGateway {

    Optional<Subsidiary> findByManagerId(UUID managerId);

}
