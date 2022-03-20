package com.example.tracingClient.controllers;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class HelloworldController {
	
	private static final org.slf4j.Logger log = 
		    org.slf4j.LoggerFactory.getLogger(HelloworldController.class);
	
	public HelloworldController(RestTemplate restTemplate)
	{
		this.restTemplate = restTemplate;
	}
	
	
	private RestTemplate restTemplate;
	
	@GetMapping("/client")
	public String greet()
	{
		log.info("Invoking API");
		restTemplate.exchange("http://localhost:8081/api", HttpMethod.GET, null, String.class);
		return "Hello world!";
	}

}
