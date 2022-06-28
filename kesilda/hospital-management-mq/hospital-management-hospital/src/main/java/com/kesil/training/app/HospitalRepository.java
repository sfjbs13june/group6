package com.kesil.training.app;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HospitalRepository extends CrudRepository<Hospital,Integer>{

}
