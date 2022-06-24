package com.kesil.training.app;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HospitalRepository extends MongoRepository<Hospital, String>{
	public Hospital findByName(String name);
	public List<Hospital> findAll();
	public Hospital findByAddress(String address);
	public void deleteByName(String name);
	public Hospital save(Hospital hospital);
//	public Hospital updateByName(Hospital hospital,String name);
	
}
