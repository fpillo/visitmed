package com.visitmed.controllers;

import com.visitmed.models.Company;
import com.visitmed.usecases.CompanyCRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

//@RestController
@RequestMapping(value = "/companies")
public class CompanyController {

    private final CompanyCRUD companyCRUD;

    @Autowired
    public CompanyController(final CompanyCRUD companyCRUD) {
        this.companyCRUD = companyCRUD;
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus(code = HttpStatus.OK)
    public Company findById(@PathVariable final UUID id) {
        return companyCRUD.findById(id);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public Company create(@RequestBody final Company company) {
        return companyCRUD.create(company);
    }

}
