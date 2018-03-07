package com.visitmed.gateways;

import com.visitmed.models.Company;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

public interface CompanyGateway {

    Optional<Company> findById(UUID id);

    Company save(Company company);

    Collection<Company> findAll();

}
