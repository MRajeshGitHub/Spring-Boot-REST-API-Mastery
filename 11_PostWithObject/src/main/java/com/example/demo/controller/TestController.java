package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
public class TestController {

	@PostMapping("/student")
	public String addStudent(@RequestBody Student student) {
		System.out.println("Hit>>> End-points");
		System.out.println("Student data from pojo class : "+student.sname);
		return "Student name is "+student.sname;
	}
}
