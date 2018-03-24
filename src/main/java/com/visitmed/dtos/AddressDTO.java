package com.visitmed.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class AddressDTO {

    private UUID id;

    private String state;

    private String city;

    @JsonProperty(value = "zip_code")
    private String zipCode;

    private String neighborhood;

    private String street;

    private Integer number;

    private Float latitude;

    private Float longitude;

}
