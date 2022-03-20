package com.example.actuator.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;






@RestController
public class HelloworldController {
	private static final org.slf4j.Logger log = 
		    org.slf4j.LoggerFactory.getLogger(HelloworldController.class);	
	@GetMapping("/hello")
	public String greet()
	{
		log.info("Test");
		
		return "Hello world!";
	}

}
