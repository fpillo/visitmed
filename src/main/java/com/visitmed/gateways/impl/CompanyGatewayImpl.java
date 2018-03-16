package com.visitmed.gateways.impl;

import com.visitmed.gateways.CompanyGateway;
import com.visitmed.gateways.CompanyRepository;
import com.visitmed.models.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
public class CompanyGatewayImpl implements CompanyGateway {

    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyGatewayImpl(final CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public Optional<Company> findById(final UUID id) {
        return Optional.ofNullable(companyRepository.findById(id));
    }

    public Company save(final Company company) {
        return companyRepository.save(company);
    }

}
