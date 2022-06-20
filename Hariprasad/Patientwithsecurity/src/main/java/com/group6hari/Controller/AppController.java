package com.group6hari.Controller;


import com.group6hari.Data.Patient;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.time.ZonedDateTime;
import java.util.List;

@RestController
public class AppController {
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