package com.visitmed.gateways;

import com.visitmed.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    User findByEmailAndEnabled(String email, Boolean isEnabled);

}
