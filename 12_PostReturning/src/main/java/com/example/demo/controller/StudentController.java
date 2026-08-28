package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
public class StudentController {

	@PostMapping("/echo")
	public Student echo(@RequestBody Student student) {
		System.out.println("End point hiss...");
		System.out.println("student data racived in "+student.name);
		return student;
	}
}
