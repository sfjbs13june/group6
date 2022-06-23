package com.group6hari20.controller;

import com.group6hari20.data.Patient;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppControllerPatient {
    @GetMapping("/getdetails")
    public String getDetail() {
        return "getting  patient Details";
    }

    @PostMapping("/addpatient")
    Patient postPatient(@RequestBody Patient newPatient) {
        return newPatient;
    }

    @PutMapping("/updatedetails/{pid}")
    String putPatient(@RequestBody Patient newPatient, @PathVariable String name) {
        return newPatient.toString() + ":Updated with name:" + name;
    }

    @DeleteMapping("/delete/{name}")
    String deletePatient(@PathVariable String name) {
        return name;
    }
}
