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
public class PatientController {

    @Autowired
    PatientRepository patientRepo;

    @GetMapping(value = "/showAllPatient")
    public Collection<Patient> getPatientList() {
        System.out.println("get All");
        return patientRepo.findAll();
    }

    @GetMapping(value = "/showPatientDetails/{name}")
    public Patient getPatientDetails(@PathVariable String name) {
        System.out.println(name);
        return   patientRepo.findByName(name);
    }

    @PostMapping("/addPatient")
    public Patient addPatient(@RequestBody Patient newPatient) {
         return  patientRepo.save(newPatient);
    }

//    @PutMapping("/modifyDetails/{name}")
//    public Patient modifyDetails(@RequestBody Patient newPatient, @PathVariable String name) {
//        return  patientRepo.updateByName(newPatient,name);
//    }

    @DeleteMapping("/removePatient/{name}")
   public String removePatient(@PathVariable String name) {
        patientRepo.deleteByName(name);
        return "Deleted";
    }


}
