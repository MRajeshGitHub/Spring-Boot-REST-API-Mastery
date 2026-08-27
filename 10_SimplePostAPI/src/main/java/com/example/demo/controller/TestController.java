package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@PostMapping("/save")
	public String save(@RequestBody String data) {
		System.out.println("E>>>>End Point Hit ");
		System.out.println("Data came from front end is : "+data);
		return "Front Data is : "+data;
	}
}
