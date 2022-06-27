package com.kesil.training.app;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.HashMap;

@RestController
public class PatientController {

    private static HashMap<Integer, Patient> patientList  = new HashMap<>();
    /**
     * Preparing Default Patient List as Map
     */
    static {
        Patient p1 = new Patient();
        p1.setId(1);
        p1.setName("Kesilda");
        p1.setAge(30);
        p1.setDisease("Migraine");
        patientList .put(p1.getId(), p1);

        Patient p2 = new Patient();
        p2.setId(2);
        p2.setName("Prema");
        p2.setAge(31);
        p2.setDisease("Back Pain");
        patientList .put(p2.getId(),p2);
    }

    @GetMapping(value = "/showAllPatient")
    public ResponseEntity<Collection<Patient>> getPatientList() {
        System.out.println("get All");
        return new ResponseEntity<>(patientList.values(), HttpStatus.OK);
    }

    @GetMapping(value = "/showPatientDetails/{id}")
    public Patient getPatientDetails(@PathVariable Integer id) {
        System.out.println(id);
        return   patientList.get(id);
    }

    @PostMapping("/addPatient")
    public Patient addPatient(@RequestBody Patient newPatient) {
        patientList.put(newPatient.getId(),newPatient);
        return newPatient;
    }

    @PutMapping("/modifyDetails/{id}")
    ResponseEntity<Collection<Patient>> modifyDetails(@RequestBody Patient newPatient, @PathVariable Integer id) {
        patientList.put(id,newPatient);
        return new ResponseEntity<>(patientList.values(), HttpStatus.OK);
    }

    @DeleteMapping("/removePatient/{id}")
    ResponseEntity<Collection<Patient>>  removePatient(@PathVariable Integer id) {
        patientList.remove(id);
        return new ResponseEntity<>(patientList.values(), HttpStatus.OK);
    }


}
