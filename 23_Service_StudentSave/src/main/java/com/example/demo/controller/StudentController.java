package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;

	@PostMapping("/student/save")
	public String addStudent(@RequestBody Student student) {
		System.out.println("post request received...");
		
		return service.addStudent(student);
	}
}
