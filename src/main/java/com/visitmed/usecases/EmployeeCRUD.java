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

    private final ValidateModel validateModel;

    @Autowired
    public EmployeeCRUD(final EmployeeGateway employeeGateway, final CompanyGateway companyGateway, final ValidateModel validateModel) {
        this.employeeGateway = employeeGateway;
        this.companyGateway = companyGateway;
        this.validateModel = validateModel;
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

        validateModel.validate(employee);

        return employeeGateway.save(employee);
    }

    public Employee updateSeller(final Employee updatedEmployee) {
        final Employee originalEmployee = employeeGateway.findById(updatedEmployee.getId()).orElseThrow(() -> new ResourceNotFoundException());

        updatedEmployee.setUser(originalEmployee.getUser());
        updatedEmployee.setCompany(originalEmployee.getCompany());
        updatedEmployee.setType(originalEmployee.getType());

        validateModel.validate(updatedEmployee);

        return employeeGateway.save(updatedEmployee);
    }

    public Employee disableSeller(final UUID companyId, final UUID id) {
        final Employee employee = employeeGateway.findById(id).orElseThrow(() -> new ResourceNotFoundException());
        employee.getUser().setEnabled(false);

        validateModel.validate(employee);

        return employeeGateway.save(employee);
    }

}
