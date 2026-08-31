package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentDbService;

@RestController
public class StudentDbController {

	@Autowired
	private StudentDbService service;
	
	@PostMapping("/db/student/save")
	public String saveStudent(@RequestBody Student student) {
		
		System.out.println("Controller request started.....");
		
		return service.saveStudentToDb(student);
	}
}
