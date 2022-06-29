package com.service.hospital.hospitalservice.controller;

import com.service.hospital.hospitalservice.model.Hospital;
import com.service.hospital.hospitalservice.producer.ArtemisProducer;
import com.service.hospital.hospitalservice.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class HospitalController {

    private final ArtemisProducer producer;


    public HospitalController(ArtemisProducer producer) {
        this.producer = producer;
    }


    @Autowired
    private RestTemplate restTemplate;
    @Value("${receive.url}")
    String receiveUrl;

    @GetMapping("/getHospitalPatientDetail")
    public String getHospitalPatientDetail(@RequestParam("hosId") int hosId,@RequestParam("patId") int patId) {
        receiveUrl = receiveUrl+"/"+patId;
        ResponseEntity<String> response
                = restTemplate.getForEntity(receiveUrl, String.class);
        System.out.println(response.getStatusCode().toString());
        System.out.println(response.getBody().toString());
        String resStr = "Hospital Response --> "+ hospitalRepo.findById(hosId).toString() + "Patient Response --> "+response.getBody().toString();

        System.out.println(resStr);;
        return resStr;
    }


    @RequestMapping(value = "/postMessage", method = RequestMethod.GET)
    public ResponseEntity<String> produce(@RequestParam("msg") String msg) {
        try {
            producer.send(msg);
            return ResponseEntity.ok()

                    .body("message sent:"+msg);
        } catch (Exception e) {

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
    public Hospital putHospital(@RequestBody Hospital newHospital) {
        return  hospitalRepo.save(newHospital);
    }

    @DeleteMapping("/removeHospital/{id}")
    public String deleteHospital(@PathVariable Integer id) {
        hospitalRepo.deleteById(id);
        return "Deleted";
    }



}
