package com.visitmed.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "contacts")
@EqualsAndHashCode(of = {"id"})
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotBlank(message = "contact.phoneNumber.notBlank")
    private String phoneNumber;

    @NotBlank(message = "contact.mobileNumber.notBlank")
    private String mobileNumber;

    @NotBlank(message = "contact.whatsapp.notBlank")
    private String whatsapp;

}
