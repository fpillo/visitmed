package com.visitmed.controllers;

import com.visitmed.dtos.HomeDTO;
import com.visitmed.models.Home;
import com.visitmed.usecases.GetManagerHome;
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

    private final GetManagerHome getHome;

    @Autowired
    public HomeController(final ModelMapper modelMapper, final GetManagerHome getHome) {
        this.modelMapper = modelMapper;
        this.getHome = getHome;
    }

    @GetMapping(value = "/home")
    @ResponseStatus(HttpStatus.OK)
    public HomeDTO getHome(final Principal principal) {
        final UUID userId = UUID.fromString(principal.getName());
        final Home home = getHome.byMangerUserId(userId);
        final HomeDTO homeDto = modelMapper.map(home, HomeDTO.class);

        return homeDto;
    }

}
