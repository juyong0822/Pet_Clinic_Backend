package com.petclinic.backend.domain.repository;

import com.petclinic.backend.domain.entity.MedicalHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalHistoryRepository extends JpaRepository<MedicalHistory, String> {
}
