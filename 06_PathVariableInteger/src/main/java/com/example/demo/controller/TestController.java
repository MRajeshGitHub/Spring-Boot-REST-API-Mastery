package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/squar/{num}")
	public int squar(@PathVariable int num) {
		System.out.println("Hitt>>>End pointd Path variable squar is "+(num*num));
		return num*num;
	}
}
