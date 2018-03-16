package com.visitmed.gateways;

import com.visitmed.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;
import java.util.UUID;

public interface EmployeeRepository extends JpaRepository<Employee, UUID> {

    Employee findByUserId(UUID id);

    Set<Employee> findByCompanyId(UUID companyId);

}
