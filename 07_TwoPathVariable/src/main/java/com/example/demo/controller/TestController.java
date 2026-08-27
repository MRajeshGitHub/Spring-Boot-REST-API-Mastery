package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("add/{a}/{b}")
	public int add(@PathVariable int a,@PathVariable int b) {
		System.out.println("Hit end points...@path values a,b addtion is :  "+(a+b));
		
		return a+b;
	}
}
