package com.visitmed.gateways;

import com.visitmed.models.Employee;
import com.visitmed.models.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;
import java.util.UUID;

public interface EmployeeRepository extends JpaRepository<Employee, UUID> {

    Employee findById(UUID id);

    Set<Employee> findByCompanyIdAndType(UUID companyId, EmployeeType type);

    Employee findByUserEmailAndCompanyId(String email, UUID companyId);

}
