package com.service.patient.patientservice.controller;

import com.service.patient.patientservice.model.Patient;
import com.service.patient.patientservice.repository.PatientRepository;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.Optional;

@RestController
public class PatientController {

    @Autowired
    PatientRepository patientRepo;

    @GetMapping(value = "/showAllPatient")
    public Iterable<Patient> getPatientList() {
        System.out.println("get All");
        return patientRepo.findAll();
    }

    @GetMapping(value = "/showPatientDetails/{id}")
    public Optional<Patient> getPatientDetails(@PathVariable Integer id) {
        System.out.println(id);
        return   patientRepo.findById(id);
    }


    @PostMapping("/addPatient")
    public Patient addPatient(@RequestBody Patient newPatient) {
        return  patientRepo.save(newPatient);
    }

    @PutMapping("/modifyDetails")
    public Patient modifyDetails(@RequestBody Patient newPatient) {
        return  patientRepo.save(newPatient);
    }

    @DeleteMapping("/removePatient/{id}")
    public String removePatient(@PathVariable Integer id) {
        patientRepo.deleteById(id);
        return "Deleted";

    }


}
