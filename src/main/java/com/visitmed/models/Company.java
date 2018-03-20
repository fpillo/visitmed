package com.visitmed.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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

    private String name;

    @Column(name = "trade_name")
    private String tradeName;

    private String cnpj;

    @Column(name = "municipal_inscription")
    private String municipalInscription;

    @Column(name = "state_inscription")
    private String stateInscription;

    @Column(name = "logo_url")
    private String logoUrl;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "company")
    private Employee manager;

}
