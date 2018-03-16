package com.visitmed.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class HomeDto {

    private CompanyDto company;

    private ManagerDto manager;

    private Set<EmployeeDto> sellers;

}
