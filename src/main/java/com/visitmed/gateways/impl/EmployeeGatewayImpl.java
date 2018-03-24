package com.visitmed.gateways.impl;

import com.visitmed.gateways.EmployeeGateway;
import com.visitmed.gateways.EmployeeRepository;
import com.visitmed.models.Employee;
import com.visitmed.models.EmployeeType;
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
    public Optional<Employee> findById(final UUID id) {
        return Optional.ofNullable(employeeRepository.findById(id));
    }

    @Override
    public Optional<Employee> findManagerByCompanyId(final UUID companyId) {
        return employeeRepository.findByCompanyIdAndType(companyId, EmployeeType.MANAGER).stream().findFirst();
    }

    @Override
    public Set<Employee> findSellersByCompanyId(final UUID companyId) {
        return employeeRepository.findByCompanyIdAndType(companyId, EmployeeType.SELLER);
    }

    @Override
    public Employee save(final Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public boolean existsByUserEmailAndCompanyId(final String email, final UUID companyId) {
        final Employee employee = employeeRepository.findByUserEmailAndCompanyId(email, companyId);
        return employee != null;
    }
}
