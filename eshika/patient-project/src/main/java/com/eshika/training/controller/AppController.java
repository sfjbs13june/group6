package com.eshika.training.controller;

import com.eshika.training.data.patient;
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

    @GetMapping("/path/{name}")
    public String getPathVar(@PathVariable("name") String name) {
        return "Path Variable:" + name;
    }

    @PostMapping("/post")
    patient postEmployee(@RequestBody patient newPatient) {
        return newPatient;
    }

    @PutMapping("/put/{name}")
    String putPatient(@RequestBody patient newPatient, @PathVariable String name) {
        return newPatient.toString() + ":Updated with name:" + name;
    }

    @DeleteMapping("/delete/{name}")
    String deletePatient(@PathVariable String name) {
        return name;
    }
}
