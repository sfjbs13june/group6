package com.kesil.training.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HospitalController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ArtemisProducer.class);
    private final ArtemisProducer producer;


    public HospitalController(ArtemisProducer producer) {
        this.producer = producer;
    }

    @RequestMapping(value = "/postMessage", method = RequestMethod.GET)
    public ResponseEntity<String> produce(@RequestParam("msg") String msg) {
        try {
            producer.send(msg);
            return ResponseEntity.ok()

                    .body("message sent:"+msg);
        } catch (Exception e) {
            LOGGER.error("Exception while handling uplink message: ", e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
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
