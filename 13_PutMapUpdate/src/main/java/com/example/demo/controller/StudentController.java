package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
public class StudentController {

	@PutMapping("/student/{id}")
	public String update(@PathVariable int id,@RequestBody Student s) {
		System.out.println("Hit>>>> end points....");
		System.out.println("Update new name  :"+s.name);
		return "ID is  :"+id+" name is  :"+s.name;
	}
}
