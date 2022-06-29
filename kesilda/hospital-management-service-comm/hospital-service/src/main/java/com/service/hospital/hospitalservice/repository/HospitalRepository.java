package com.service.hospital.hospitalservice.repository;

import com.service.hospital.hospitalservice.model.Hospital;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HospitalRepository extends CrudRepository<Hospital,Integer>{

}
