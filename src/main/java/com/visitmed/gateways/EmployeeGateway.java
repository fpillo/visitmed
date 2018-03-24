package com.visitmed.gateways;

import com.visitmed.models.Employee;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface EmployeeGateway {

    Optional<Employee> findById(UUID id);

    Optional<Employee> findManagerByCompanyId(UUID companyId);

    Set<Employee> findSellersByCompanyId(UUID companyId);

    Employee save(Employee employee);

    boolean existsByUserEmailAndCompanyId(String email, UUID companyId);

}
