package com.visitmed.gateways.impl;

import com.visitmed.gateways.EmployeeGateway;
import com.visitmed.gateways.EmployeeRepository;
import com.visitmed.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

@Component
public class EmployeeGatewayImpl implements EmployeeGateway {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeGatewayImpl(final EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Optional<Employee> findByUserId(final UUID userId) {
        return Optional.ofNullable(employeeRepository.findByUserId(userId));
    }

    @Override
    public Set<Employee> findByCompanyId(final UUID companyId) {
        return employeeRepository.findByCompanyId(companyId);
    }
}
