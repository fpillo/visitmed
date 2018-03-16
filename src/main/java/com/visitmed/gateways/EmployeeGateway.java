package com.visitmed.gateways;

import com.visitmed.models.Employee;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface EmployeeGateway {

    Optional<Employee> findByUserId(UUID userId);

    Set<Employee> findByCompanyId(UUID companyId);

}
