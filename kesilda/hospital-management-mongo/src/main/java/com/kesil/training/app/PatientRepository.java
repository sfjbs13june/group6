package com.kesil.training.app;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends MongoRepository<Patient, String>{
	public Patient findByName(String name);
	public Patient findByDisease(String disease);
	public void deleteByName(String name);
	public Patient save(Patient patient);
	public List<Patient> findAll();
}
