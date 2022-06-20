package com.kesil.training.app;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.HashMap;

@RestController
public class HospitalController {

    private static HashMap<Integer, Hospital> hospitalList  = new HashMap<>();
    /**
     * Preparing Default Patient List as Map
     */
    static {
        Hospital p1 = new Hospital();
        p1.setId(1);
        p1.setName("GH");
        p1.setAddress("GHChennai");
        hospitalList .put(p1.getId(), p1);

        Hospital p2 = new Hospital();
        p2.setId(2);
        p2.setName("Private Hospital");
        p2.setAddress("chengal Chennai");
        hospitalList .put(p2.getId(), p2);
    }

    @GetMapping(value = "/getAllHospital")
    public ResponseEntity<Collection<Hospital>> getAllHospital() {
        System.out.println("get All");
        return new ResponseEntity<>(hospitalList.values(), HttpStatus.OK);
    }



    @PostMapping("/addHospital")
    public Hospital postHospital(@RequestBody Hospital newHospital) {
        hospitalList.put(newHospital.getId(),newHospital);
        return newHospital;
    }

    @PutMapping("/modifyHospitalDetails/{id}")
    ResponseEntity<Collection<Hospital>> putHospital(@RequestBody Hospital newHospital, @PathVariable Integer id) {
        hospitalList.put(id,newHospital);
        return new ResponseEntity<>(hospitalList.values(), HttpStatus.OK);
    }

    @DeleteMapping("/removeHospital/{id}")
    ResponseEntity<Collection<Hospital>>  deleteHospital(@PathVariable Integer id) {
        hospitalList.remove(id);
        return new ResponseEntity<>(hospitalList.values(), HttpStatus.OK);
    }



}
