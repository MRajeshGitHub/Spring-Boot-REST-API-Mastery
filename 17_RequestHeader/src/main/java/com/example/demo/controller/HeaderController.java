package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeaderController {

	@GetMapping("/header-check")
	public String header(@RequestHeader("User-Agent")String agent) {
		System.out.println("Ent points hitt>>>>>>");
		
		return "You coming here..."+agent;
	}
}
