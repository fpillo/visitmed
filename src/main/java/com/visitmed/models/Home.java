package com.visitmed.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Set;

@Getter
@AllArgsConstructor
public class Home {

    private final Company company;

    private final Manager manager;

    private Set<Employee> sellers;

}
