package com.example.demo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/info")
	public Map<String, String> info(){
		System.out.println("==================");
		System.out.println(">>> End Points...");
		System.out.println("==================");
		
		return Map.of(
				"app", "MyAPI", 
		        "version", "1.0",
		        "developer", "Rajesh"
				
				);
		
		
		
	}
}
