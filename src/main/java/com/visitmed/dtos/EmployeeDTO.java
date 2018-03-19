package com.visitmed.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class EmployeeDTO {

    private UUID id;

    @JsonProperty(value = "first_name")
    private String firstName;

    @JsonProperty(value = "last_name")
    private String lastName;

    @JsonProperty(value = "employee_type")
    private String type;

    private String rg;

    private String cpf;

    @JsonProperty(value = "photo_url")
    private String photoUrl;

}
