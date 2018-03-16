package com.visitmed.usecases;

import com.visitmed.exceptions.ResourceNotFoundException;
import com.visitmed.gateways.ManagerGateway;
import com.visitmed.models.Company;
import com.visitmed.models.Home;
import com.visitmed.models.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GetManagerHome {

    private final ManagerGateway managerGateway;

    @Autowired
    public GetManagerHome(final ManagerGateway managerGateway) {
        this.managerGateway = managerGateway;
    }

    public Home byMangerUserId(final UUID userId) {
        final Manager manager = managerGateway.findByUserId(userId).orElseThrow(() -> new ResourceNotFoundException());
        final Company company = manager.getCompany();

        return new Home(company, manager);
    }

}
