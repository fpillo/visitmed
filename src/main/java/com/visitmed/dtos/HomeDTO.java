package com.visitmed.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class HomeDTO {

    private CompanyDTO company;

    private EmployeeDTO manager;

}
