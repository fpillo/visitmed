package com.visitmed.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class CompanyDTO {

    private UUID id;

    private String name;

    @JsonProperty(value = "trade_name")
    private String tradeName;

    private String cnpj;

    @JsonProperty(value = "municipal_inscription")
    private String municipalInscription;

    @JsonProperty(value = "state_inscription")
    private String stateInscription;

    @JsonProperty(value = "logo_url")
    private String logoUrl;

}
