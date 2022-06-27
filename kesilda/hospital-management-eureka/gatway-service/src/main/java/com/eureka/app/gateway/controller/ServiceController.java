package com.eureka.app.gateway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServiceController {
	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/getHospitalList", method = RequestMethod.GET)
	public String getHospitalList() {
		System.out.println("Getting Hospital details for " );
		String response = restTemplate.exchange("http://hospital-managment/getAllHospital",
				HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
				}).getBody();

		System.out.println("Response Received as " + response);

		return "Hospital List : " + response;
	}
	@RequestMapping(value = "/getPatientList", method = RequestMethod.GET)
	public String getPatientList() {
		System.out.println("Getting Patient details for " );
		String response = restTemplate.exchange("http://hospital-managment/showAllPatient",
				HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
				}).getBody();

		System.out.println("Response Received as " + response);

		return "Hospital List : " + response;
	}

}
