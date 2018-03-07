package com.visitmed.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class SubsidiaryDto {

    private UUID id;

    private String name;

}
