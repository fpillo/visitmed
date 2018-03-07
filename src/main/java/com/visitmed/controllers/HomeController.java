package com.visitmed.controllers;

import com.visitmed.dtos.HomeDto;
import com.visitmed.models.Home;
import com.visitmed.usecases.GetHome;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.UUID;

@RestController
public class HomeController {

    private final ModelMapper modelMapper;

    private final GetHome getHome;

    @Autowired
    public HomeController(final ModelMapper modelMapper, final GetHome getHome) {
        this.modelMapper = modelMapper;
        this.getHome = getHome;
    }

    @GetMapping(value = "/home")
    @ResponseStatus(HttpStatus.OK)
    public HomeDto getHome(final Principal principal) {
        final UUID userId = UUID.fromString(principal.getName());
        final Home home = getHome.getHome(userId);
        final HomeDto homeDto = modelMapper.map(home, HomeDto.class);

        return homeDto;
    }

}
