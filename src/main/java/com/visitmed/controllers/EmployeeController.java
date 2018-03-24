package com.visitmed.controllers;

import com.visitmed.dtos.EmployeeDTO;
import com.visitmed.models.Employee;
import com.visitmed.usecases.EmployeeCRUD;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

@RestController
public class EmployeeController {

    private final ModelMapper modelMapper;

    private final EmployeeCRUD employeeCRUD;

    public EmployeeController(final ModelMapper modelMapper, final EmployeeCRUD employeeCRUD) {
        this.modelMapper = modelMapper;
        this.employeeCRUD = employeeCRUD;
    }

    @GetMapping(value = "/{company_id}/sellers/{id}")
    @ResponseStatus(HttpStatus.OK)
    public EmployeeDTO findById(@PathVariable(name = "company_id") final UUID companyId,
                                 @PathVariable(name = "id") final UUID id) {

        final Employee employee = employeeCRUD.findById(id);
        return modelMapper.map(employee, EmployeeDTO.class);
    }

    @GetMapping(value = "/{company_id}/sellers")
    @ResponseStatus(HttpStatus.OK)
    public Collection<EmployeeDTO> findAll(@PathVariable(name = "company_id") final UUID companyId) {
        final Collection<Employee> employees = employeeCRUD.getSellersByCompanyId(companyId);

        Type listType = new TypeToken<List<EmployeeDTO>>() {}.getType();
        List<EmployeeDTO> employeesDTO = modelMapper.map(employees, listType);

        return employeesDTO;
    }

    @PutMapping(value = "/{company_id}/sellers")
    @ResponseStatus(HttpStatus.OK)
    public EmployeeDTO update(@RequestBody final EmployeeDTO employeeDTO) {
        final Employee employee = modelMapper.map(employeeDTO, Employee.class);
        return modelMapper.map(employeeCRUD.updateSeller(employee), EmployeeDTO.class);
    }

    @PostMapping(value = "/{company_id}/sellers")
    @ResponseStatus(HttpStatus.CREATED)
    public EmployeeDTO create(@PathVariable(name = "company_id") final UUID companyId,
                              @RequestBody final EmployeeDTO employeeDTO) {

        final Employee employee = modelMapper.map(employeeDTO, Employee.class);
        return modelMapper.map(employeeCRUD.createSeller(companyId, employee), EmployeeDTO.class);
    }

    @DeleteMapping(value = "/{company_id}/sellers/{id}")
    @ResponseStatus(HttpStatus.OK)
    public EmployeeDTO disable(@PathVariable(name = "company_id") final UUID companyId,
                                 @PathVariable(name = "id") final UUID id) {

        final Employee employee = employeeCRUD.disableSeller(companyId, id);
        return modelMapper.map(employee, EmployeeDTO.class);
    }

}
