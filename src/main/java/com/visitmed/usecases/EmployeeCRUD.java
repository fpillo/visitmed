package com.visitmed.usecases;

import com.visitmed.exceptions.ResourceAlreadyExistsException;
import com.visitmed.exceptions.ResourceNotFoundException;
import com.visitmed.gateways.CompanyGateway;
import com.visitmed.gateways.EmployeeGateway;
import com.visitmed.models.Company;
import com.visitmed.models.Employee;
import com.visitmed.models.EmployeeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;

@Service
public class EmployeeCRUD {

    private final EmployeeGateway employeeGateway;

    private final CompanyGateway companyGateway;

    @Autowired
    public EmployeeCRUD(final EmployeeGateway employeeGateway, final CompanyGateway companyGateway) {
        this.employeeGateway = employeeGateway;
        this.companyGateway = companyGateway;
    }

    public Employee findById(final UUID id) {
        return employeeGateway.findById(id).orElseThrow(() -> new ResourceNotFoundException());
    }

    public Collection<Employee> getSellersByCompanyId(final UUID companyId) {
        return employeeGateway.findSellersByCompanyId(companyId);
    }

    public Employee createSeller(final UUID companyId, final Employee employee) {
        if (employeeGateway.existsByUserEmailAndCompanyId(employee.getUser().getEmail(), companyId)) {
            throw new ResourceAlreadyExistsException();
        }
        final Company company = companyGateway.findById(companyId).orElseThrow(() -> new ResourceNotFoundException());

        employee.setType(EmployeeType.SELLER);
        employee.setCompany(company);

        return employeeGateway.save(employee);
    }

    public Employee updateSeller(final Employee updatedEmployee) {
        final Employee originalEmployee = employeeGateway.findById(updatedEmployee.getId()).orElseThrow(() -> new ResourceNotFoundException());

        updatedEmployee.setUser(originalEmployee.getUser());
        updatedEmployee.setCompany(originalEmployee.getCompany());
        updatedEmployee.setType(originalEmployee.getType());

        return employeeGateway.save(updatedEmployee);
    }

}
