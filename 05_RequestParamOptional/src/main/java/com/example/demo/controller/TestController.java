package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/check")
	public String check(@RequestParam(required = false) String code) {
		System.out.println(">>hit end points :"+code);
		return code == null ? "Code नहीं दिया" : "Code: " + code;
	}
}
