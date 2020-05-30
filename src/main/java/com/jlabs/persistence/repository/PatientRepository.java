package com.jlabs.persistence.repository;

import com.jlabs.persistence.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PatientRepository extends JpaRepository<PatientEntity, String> {

    public Optional<PatientEntity> findById(int id);
}
