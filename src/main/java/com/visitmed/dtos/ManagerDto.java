package com.visitmed.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ManagerDto {

    //@JsonProperty(value = "first_name")
    private String firstName;

    //@JsonProperty(value = "last_name")
    private String lastName;

}
