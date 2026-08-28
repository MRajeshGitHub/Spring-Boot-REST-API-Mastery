package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	private List<String> name= new ArrayList<>();
	
	@PostMapping("/add")
	public String add(@RequestBody String user) {
		System.out.println("Hit url and add name ");
	
		name.add(user);
		System.out.println(name);
		return "User Name added : "+user;
		
	}
	 @DeleteMapping("/remove")
	public String deleteName() {
		 if(!name.isEmpty()) {
			 String remove=name.remove(0);
			 System.out.println(name+"name removed");
			 return remove+" : removed";
		 }
		 return "List is emply only";
	 }
}
