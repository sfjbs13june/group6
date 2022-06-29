package com.service.patient.patientservice.repository;

import com.service.patient.patientservice.model.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Integer>{
}
