package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DivService;

@RestController
public class DivController {

	@Autowired
	private DivService divService;
	
	@GetMapping("/div")
	public String divNum(@RequestParam int a,@RequestParam int b) {
		
		try {
		int result=divService.doDivision(a, b);
		
		return "Restult form controller  : "+result;
		}
		
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Controller layer issue");
			return "Mistake in code :"+e.getMessage();
		}
	}
}

