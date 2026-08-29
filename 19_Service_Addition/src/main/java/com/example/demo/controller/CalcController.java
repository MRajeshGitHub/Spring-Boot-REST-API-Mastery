package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CalcService;

@RestController
public class CalcController {
	
	@Autowired
	private CalcService calcService;
	
	@GetMapping("/add")
	public String addNum(@RequestParam int a,@RequestParam int b) {
		
		int sum=calcService.doAddtion(a, b);
		
		return "addtion is  :"+sum;
	}

}
