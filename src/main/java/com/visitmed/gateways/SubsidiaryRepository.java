package com.visitmed.gateways;

import com.visitmed.models.Subsidiary;
import com.visitmed.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SubsidiaryRepository extends JpaRepository<Subsidiary, UUID> {

    Subsidiary findByManagerId(UUID id);

}
