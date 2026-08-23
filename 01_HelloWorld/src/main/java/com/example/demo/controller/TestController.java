package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/hello")
	public String hello() {
		//console message
		System.out.println("End Point Hit huwa hai...");
		return "Hello World To Rest API...!!";
	}
}
