package com.visitmed.gateways;

import com.visitmed.models.Employee;
import com.visitmed.models.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;
import java.util.UUID;

public interface EmployeeRepository extends JpaRepository<Employee, UUID> {

    Set<Employee> findByCompanyIdAndType(UUID companyId, EmployeeType type);

}
