package com.visitmed.usecases;

import com.visitmed.exceptions.ResourceNotFoundException;
import com.visitmed.gateways.CompanyGateway;
import com.visitmed.models.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;

//@Service
public class CompanyCRUD {

    private final CompanyGateway companyGateway;

    @Autowired
    public CompanyCRUD(final CompanyGateway companyGateway) {
        this.companyGateway = companyGateway;
    }

    public Company findById(final UUID id) {
        return companyGateway.findById(id).orElseThrow(() -> new ResourceNotFoundException());
    }

    public Company create(final Company company) {
        company.setId(UUID.randomUUID());
        return companyGateway.save(company);
    }

}
