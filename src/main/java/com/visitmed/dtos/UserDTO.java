package com.visitmed.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class UserDTO {

    private UUID id;

    private String email;

    private boolean enabled;

}
