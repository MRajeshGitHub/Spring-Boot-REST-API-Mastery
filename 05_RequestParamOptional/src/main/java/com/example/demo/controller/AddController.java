package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {

	@GetMapping("/addtion")
	public int multiply(@RequestParam Integer a,@RequestParam Integer b) {
		System.out.println(">>>End point hit for A+B Addtion : "+(a+b));
		
		return a+b;
	}
}
