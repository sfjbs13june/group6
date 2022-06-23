package com.group6hari20.controller;

import com.group6hari20.data.Hospital;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/delete/hospital/{hname}")
    String deleteHospital(@PathVariable String hname) {
        return hname;
    }
}

