package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {

	@GetMapping("/divide")
	public String divide(@RequestParam int a, @RequestParam int b) {
		System.out.println("Hit End Points.......>>>>>>");
		
		if(b==0) {
			System.out.println("if you divide by 0");
			return "wrong intput 0,not divive by 0";
		}
		
		int result =a/b;
		return "result is : "+result;
	}
}
