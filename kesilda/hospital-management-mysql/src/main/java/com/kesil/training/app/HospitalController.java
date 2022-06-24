package com.kesil.training.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HospitalController {
    @Autowired
    HospitalRepository hospitalRepo;
    @GetMapping(value = "/getAllHospital")
    public Iterable<Hospital> getAllHospital() {
        System.out.println("get All");
        return hospitalRepo.findAll();
    }
    @PostMapping("/addHospital")
    public Hospital postHospital(@RequestBody Hospital newHospital) {

        return  hospitalRepo.save(newHospital);
    }

    @PutMapping("/modifyHospitalDetails")
    public Hospital  putHospital(@RequestBody Hospital newHospital) {
        return  hospitalRepo.save(newHospital);
    }

    @DeleteMapping("/removeHospital/{id}")
   public String deleteHospital(@PathVariable Integer id) {
        hospitalRepo.deleteById(id);
        return "Deleted";
    }



}
