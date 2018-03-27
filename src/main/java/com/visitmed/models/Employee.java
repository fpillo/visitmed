package com.visitmed.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Setter
@Getter
@Entity
@Table(name = "employees")
@EqualsAndHashCode(of = {"id"})
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotBlank(message = "employee.firstName.notBlank")
    @Column(name = "first_name")
    private String firstName;

    @NotBlank(message = "employee.lastName.notBlank")
    @Column(name = "last_name")
    private String lastName;

    @NotNull(message = "employee.type.notNull")
    @Column(name = "employee_type")
    @Enumerated(EnumType.STRING)
    private EmployeeType type;

    @NotBlank(message = "employee.rg.notBlank")
    private String rg;

    @NotBlank(message = "employee.cpf.notBlank")
    private String cpf;

    @NotBlank(message = "employee.photoUrl.notBlank")
    @Column(name = "photo_url")
    private String photoUrl;

    @Valid
    @NotNull(message = "employee.user.notNull")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id")
    private User user;

    @Valid
    @NotNull(message = "employee.company.notNull")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    @Valid
    @NotNull(message = "employee.address.notNull")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "address_id")
    private Address address;

    @Valid
    @NotNull(message = "employee.contact.notNull")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "contact_id")
    private Contact contact;

}
