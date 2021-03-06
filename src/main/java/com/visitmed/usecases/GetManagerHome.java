package com.visitmed.usecases;

import com.visitmed.exceptions.ResourceNotFoundException;
import com.visitmed.gateways.CompanyGateway;
import com.visitmed.gateways.EmployeeGateway;
import com.visitmed.models.Company;
import com.visitmed.models.Employee;
import com.visitmed.models.Home;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GetManagerHome {

    private final CompanyGateway companyGateway;

    private final EmployeeGateway employeeGateway;

    @Autowired
    public GetManagerHome(final CompanyGateway companyGateway, final EmployeeGateway employeeGateway) {
        this.companyGateway = companyGateway;
        this.employeeGateway = employeeGateway;
    }

    public Home byCompanyId(final UUID companyId) {
        final Company company = companyGateway.findById(companyId).orElseThrow(() -> new ResourceNotFoundException());
        final Employee manager = employeeGateway.findManagerByCompanyId(companyId).orElseThrow(() -> new ResourceNotFoundException());

        return new Home(company, manager);
    }

}
