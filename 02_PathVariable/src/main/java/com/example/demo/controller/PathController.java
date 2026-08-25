package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathController {

	@GetMapping("/user/{name}")
	public String Path(@PathVariable String name) {
		System.out.println(">>>/user/{name end point me hit hiwa..}"+name);
		
		return "hello"+name+"..!	";
	}
}
