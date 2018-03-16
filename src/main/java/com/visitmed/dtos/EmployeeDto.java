package com.visitmed.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeDto {

    @JsonProperty(value = "first_name")
    private String firstName;

    @JsonProperty(value = "last_name")
    private String lastName;

}
