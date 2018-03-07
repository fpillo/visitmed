package com.visitmed.auth;

import lombok.Getter;
import org.springframework.security.core.userdetails.User;

import java.util.Collections;
import java.util.UUID;

@Getter
public class AuthUser extends User {

    private final UUID id;

    public AuthUser(final UUID id, final String username, final String password) {
        super(username,
                password,
                true,
                true,
                true,
                true,
                Collections.emptyList());

        this.id = id;
    }


}
