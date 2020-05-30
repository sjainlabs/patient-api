package com.jlabs.persistence;

import com.jlabs.model.Patient;
import com.jlabs.persistence.entity.PatientEntity;
import com.jlabs.persistence.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PatientPersistence {

    private PatientRepository patientRepository;

    @Autowired
    public PatientPersistence(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

//    public String savePatient(Patient patient){
//        PatientEntity patientEntity= PatientEntity.builder()
//    }

    public List<Patient> findAllPatient(){
        List<PatientEntity> patientEntityList = patientRepository.findAll();
        return patientEntityList.stream()
                .map(patientEntity -> patientEntityToPatientMapper(patientEntity))
                .collect(Collectors.toList());
    }

    private Patient patientEntityToPatientMapper(PatientEntity patientEntity){
        return Patient.builder()
                .firstName(patientEntity.getFirstName())
                .lastName(patientEntity.getLastName())
                .build();
    }

    public Optional<PatientEntity> searchPatient(int id){
        return patientRepository.findById((id));
    }
}
