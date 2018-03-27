package com.visitmed.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Setter
@Getter
@Entity
@Table(name = "companies")
@EqualsAndHashCode(of = {"id"})
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotBlank(message = "company.name.notBlank")
    private String name;

    @NotBlank(message = "company.tradeName.notBlank")
    @Column(name = "trade_name")
    private String tradeName;

    @NotBlank(message = "company.cnpj.notBlank")
    private String cnpj;

    @NotBlank(message = "company.municipalInscription.notBlank")
    @Column(name = "municipal_inscription")
    private String municipalInscription;

    @NotBlank(message = "company.stateInscription.notBlank")
    @Column(name = "state_inscription")
    private String stateInscription;

    @NotBlank(message = "company.logoUrl.notBlank")
    @Column(name = "logo_url")
    private String logoUrl;

}
