package com.visitmed.usecases;

import com.visitmed.exceptions.ResourceNotFoundException;
import com.visitmed.gateways.EmployeeGateway;
import com.visitmed.models.Company;
import com.visitmed.models.Employee;
import com.visitmed.models.Home;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GetManagerHome {

    private final EmployeeGateway employeeGateway;

    @Autowired
    public GetManagerHome(final EmployeeGateway employeeGateway) {
        this.employeeGateway = employeeGateway;
    }

    public Home byMangerUserId(final UUID userId) {
        final Employee manager = employeeGateway.findByUserId(userId).orElseThrow(() -> new ResourceNotFoundException());
        final Company company = manager.getCompany();

        return new Home(company, manager);
    }

}
