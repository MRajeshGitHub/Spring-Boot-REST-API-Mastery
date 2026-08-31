package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

	private List<Student> list = new ArrayList<>();

	//constructor
	public StudentController() {
		list.add(new Student(1, "Rajesh Kumar", "Hyderabad"));
	}
	
	// 1. GET API
    @GetMapping("/students")
    public List<Student> getAll() {
        return list;
    }
    
 // 2. POST API
    @PostMapping("/students")
    public String saveStudent(@RequestBody Student student) {
        list.add(student);
        return "Student Saved Successfully!";
    }
	
}
