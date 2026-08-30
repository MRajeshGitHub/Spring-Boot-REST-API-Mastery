package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MutateService;

@RestController
public class MutateController {
	
	@Autowired
	private MutateService mutateService;

	@GetMapping("/mul")
	public String multiply(@RequestParam int a,@RequestParam int b) {
		
		int result=mutateService.doMultiplication(a, b);
		
		return "Multiplication form controller is : "+result;
		
		
		
	}
}
