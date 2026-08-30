package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.SubService;

@RestController
public class SubController {
	
	@Autowired
	private SubService service;
	
	@GetMapping("/get")
	public String subNumber(@RequestParam int a,@RequestParam int b) {
		System.out.println("REquest fron controller layer for a and b"+a+"--"+b);
		
		int result=service.doSubtract(a, b);
		
		return "Result from controller is "+result;
	}

}
