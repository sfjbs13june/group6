package com.group6project2.Controller;

import com.group6project2.Data.Patient;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.time.ZonedDateTime;
import java.util.List;

@RestController
public class AppController {
    @GetMapping("/get")
    public String getDetail() {
        return "get patient ";
    }

    @PostMapping("/post")
    Patient postEmployee(@RequestBody Patient newPatient) {
        return newPatient;
    }

    @PutMapping("/put/{name}")
    String putEmployee(@RequestBody Patient newPatient, @PathVariable String name) {
        return newPatient.toString() + ":Updated with name:" + name;
    }

    @DeleteMapping("/delete/{name}")
    String deletePatient(@PathVariable String name) {
        return name;
    }

}
