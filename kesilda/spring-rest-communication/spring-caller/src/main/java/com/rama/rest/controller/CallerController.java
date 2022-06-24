package com.rama.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CallerController {
  private static final Logger LOGGER = LoggerFactory.getLogger(CallerController.class);
  @Autowired
  private RestTemplate restTemplate;
  @Value("${receive.url}")
  String receiveUrl; // ="http://localhost:10082/receiver/get";
  @Value("${receive.hello.url}")
  String receiveHelloUrl;
  @GetMapping("/caller/get")
  public String getDetail() {
    ResponseEntity<String> response
      = restTemplate.getForEntity(receiveUrl, String.class);
    System.out.println(response.getStatusCode().toString());
    System.out.println(response.getBody());
    return "caller receive data:"+response.getBody();
  }

  @GetMapping("/caller/hello")
  public String getDetailfromHello() {
    ResponseEntity<String> response
            = restTemplate.getForEntity(receiveHelloUrl, String.class);
    System.out.println(response.getStatusCode().toString());
    System.out.println(response.getBody());
    return "caller receive data:"+response.getBody();
  }
}
