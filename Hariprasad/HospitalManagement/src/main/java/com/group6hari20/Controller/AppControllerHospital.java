package com.group6hari20.Controller;

import com.group6hari20.Data.Hospital;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.time.ZonedDateTime;
import java.util.List;

@RestController
public class AppControllerHospital {
    @GetMapping("/GetHospital")
    public String getDetail() {
        return "Getting Hospital details";
    }

    @PostMapping("/addhospital")
    Hospital postHospital(@RequestBody Hospital newHospital) {
        return newHospital;
    }

    @PutMapping("/updatehospital/{hid}")
    String putHospital(@RequestBody Hospital newHospital, @PathVariable String name) {
        return newHospital.toString() + ":Updated with hospital name:" + name;
    }

    @DeleteMapping("/delete/{name}")
    String deletePatient(@PathVariable String name) {
        return name;
    }
}

