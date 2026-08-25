package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/profile")
	public String profile(@RequestParam(defaultValue = "Guest") String user) {
		System.out.println(">>>Hit End points : "+user);
		
		return "Profile Page of :"+user;
	}
}
