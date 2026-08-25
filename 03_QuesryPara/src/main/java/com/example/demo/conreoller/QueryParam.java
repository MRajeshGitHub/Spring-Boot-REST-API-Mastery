package com.example.demo.conreoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryParam {

	@GetMapping("/search")
	public String search(@RequestParam String item) {
		System.out.println(">>hit end points for Query param..!");
		return "Data from URL is "+item+".";
	}
}
