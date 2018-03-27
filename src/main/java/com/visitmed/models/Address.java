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
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "addresses")
@EqualsAndHashCode(of = {"id"})
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotBlank(message = "address.state.notBlank")
    private String state;

    @NotBlank(message = "address.city.notBlank")
    private String city;

    @NotBlank(message = "address.zipCode.notBlank")
    @Column(name = "zip_code")
    private String zipCode;

    @NotBlank(message = "address.neighborhood.notBlank")
    private String neighborhood;

    @NotBlank(message = "address.street.notBlank")
    private String street;

    @NotNull(message = "address.number.notNull")
    private Integer number;

    @NotNull(message = "address.latitude.notNull")
    private Float latitude;

    @NotNull(message = "address.longitude.notNull")
    private Float longitude;

}
