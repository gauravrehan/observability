package com.example.tracingApi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloworldController {
	
	private static final org.slf4j.Logger log = 
		    org.slf4j.LoggerFactory.getLogger(HelloworldController.class);
	
	@GetMapping("/api")
	public String greet()
	{
		log.info("API Invoked");
		return "Hello world!";
	}

}
