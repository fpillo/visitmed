package com.visitmed.controllers;

import com.visitmed.models.Subsidiary;
import com.visitmed.usecases.SubsidiaryCRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

//@RestController
public class SubsidiaryController {

//    private final SubsidiaryCRUD subsidiaryCRUD;

//    @Autowired
//    public SubsidiaryController(final SubsidiaryCRUD subsidiaryCRUD) {
//        this.subsidiaryCRUD = subsidiaryCRUD;
//    }
//
//    @PostMapping(value = "/companies/{companyId}/subsidiaries", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//    @ResponseStatus(HttpStatus.CREATED)
//    public Subsidiary create(@PathVariable(name = "companyId") final UUID companyId, @RequestBody final Subsidiary subsidiary) {
//        return subsidiaryCRUD.create(companyId, subsidiary);
//    }
//
//    @GetMapping(value = "/subsidiaries/{subsidiaryId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//    @ResponseStatus(HttpStatus.OK)
//    public Subsidiary findById(@PathVariable(name = "subsidiaryId") final UUID subsidiaryId) {
//        return subsidiaryCRUD.findById(subsidiaryId);
//    }

}
