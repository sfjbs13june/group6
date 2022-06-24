package com.kesil.training.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.HashMap;

@RestController
public class HospitalController {
    @Autowired
    HospitalRepository hospitalRepo;
    @GetMapping(value = "/getAllHospital")
    public Collection<Hospital> getAllHospital() {
        System.out.println("get All");
        return hospitalRepo.findAll();
    }
    @PostMapping("/addHospital")
    public Hospital postHospital(@RequestBody Hospital newHospital) {

        return  hospitalRepo.save(newHospital);
    }

//    @PutMapping("/modifyHospitalDetails/{name}")
//    public Hospital  putHospital(@RequestBody Hospital newHospital, @PathVariable String name) {
//        return  hospitalRepo.updateByName(newHospital,name);
//    }

    @DeleteMapping("/removeHospital/{name}")
   public String deleteHospital(@PathVariable String name) {
        hospitalRepo.deleteByName(name);
        return "Deleted";
    }



}
