package com.visitmed.gateways;

import com.visitmed.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CompanyRepository extends JpaRepository<Company, UUID>{

    Company findById(UUID id);

}
