package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

	@GetMapping("/notfound")
	public ResponseEntity<String> notFound(){
		
		System.out.println(">>>> end points...");
		
		return new ResponseEntity<>("nothing get",HttpStatus.NOT_FOUND);
	}
	
}
