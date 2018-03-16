package com.visitmed.gateways;

import com.visitmed.models.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ManagerRepository extends JpaRepository<Manager, UUID> {

    Manager findByUserId(UUID userId);

}
