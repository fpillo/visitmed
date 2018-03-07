package com.visitmed.usecases;

import com.visitmed.exceptions.ResourceNotFoundException;
import com.visitmed.gateways.SubsidiaryGateway;
import com.visitmed.models.Subsidiary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SubsidiaryCRUD {

    private final SubsidiaryGateway subsidiaryGateway;

    //private final CompanyCRUD companyCRUD;

    @Autowired
    public SubsidiaryCRUD(final SubsidiaryGateway subsidiaryGateway) {
        this.subsidiaryGateway = subsidiaryGateway;
        //this.companyCRUD = companyCRUD;
    }

//    public Subsidiary create(final UUID companyId, final Subsidiary subsidiary) {
//        final Company company = companyCRUD.findById(companyId);
//        subsidiary.setId(UUID.randomUUID());
//        subsidiary.setCompany(company);
//
//        return subsidiaryGateway.save(subsidiary);
//    }

    public Subsidiary findByManagerId(final UUID managerId) {
        return subsidiaryGateway.findByManagerId(managerId).orElseThrow(() -> new ResourceNotFoundException());
    }

}
