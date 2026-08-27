package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/status")
	public ResponseEntity<String> status(){
		System.out.println("Hit>>>status end points...");
		
		return new ResponseEntity<>("All GOOD",HttpStatus.SERVICE_UNAVAILABLE);
	}
	
	@GetMapping("/notfound")
	public ResponseEntity<String> notFound(){
		System.out.println("Hit end point not found details....");
		
		return new ResponseEntity<>("notfound",HttpStatus.NOT_FOUND);
	}
}
