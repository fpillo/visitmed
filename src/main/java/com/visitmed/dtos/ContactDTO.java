package com.visitmed.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class ContactDTO {

    private UUID id;

    @JsonProperty(value = "phone_number")
    private String phoneNumber;

    @JsonProperty(value = "mobile_number")
    private String mobileNumber;

    private String whatsapp;

}
