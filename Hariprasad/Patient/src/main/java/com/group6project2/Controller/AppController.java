package com.group6project2.Controller;

import java.util.Scanner;

import com.group6project2.Data.Patient;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.List;

@RestController
public class AppController {
    public static void main(String [] args) {
        Scanner port = new Scanner(System.in);
        System.out.println("Enter tombcat environment to run ex: dev , test, prod  ");
        String server = port.nextLine();
    }

        @PostMapping("/addpatient")
        Patient postPatient(@RequestBody Patient newPatient) {
        return newPatient;
    }

        @GetMapping("/getdetails")
        public String getDetail() {
            return "getting  patient Details";
        }


        @PutMapping("/updatedetails/{pid}")
        String putPatient(@RequestBody Patient newPatient, @PathVariable String pid) {
            return newPatient.toString() + ":Updated with name:" + pid;
        }

        @DeleteMapping("/delete/{name}")
        String deletePatient(@PathVariable String name) {
            return name;
        }
    }