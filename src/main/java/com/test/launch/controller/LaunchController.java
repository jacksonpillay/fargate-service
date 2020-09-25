package com.test.launch.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaunchController {
	
	

	@GetMapping("/welcome")
	public ResponseEntity<String> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		
		final String temp = new String ("Hello "+name);
	return new ResponseEntity<String>(temp,HttpStatus.OK);
	}

	
	@GetMapping("/")
	public ResponseEntity<String> getVersion() {
		
		final String temp = new String ("Fargate Application up and running Version 1.0");
	return new ResponseEntity<String>(temp,HttpStatus.OK);
	}

}
