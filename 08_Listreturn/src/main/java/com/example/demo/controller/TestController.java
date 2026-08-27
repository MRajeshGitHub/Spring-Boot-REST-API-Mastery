package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/fruit")
	public List<String> fruits(){
		System.out.println("Hit end Points");
		return List.of("Mango","Apple","papaaya","Greps");
	}
}
