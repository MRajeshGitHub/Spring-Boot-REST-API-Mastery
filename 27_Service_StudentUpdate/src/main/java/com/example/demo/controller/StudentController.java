package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	
	
	@PutMapping("/student/update") // 👈 अपडेट के लिए हमेशा PUT मेथड का कड़ा नियम
    public String updateStudent(@RequestBody Student student) {
        System.out.println(">>> [Controller Layer] PUT रिक्वेस्ट प्राप्त हुई!");
        return service.updateStudentDetails(student);
    }
	
	
	@GetMapping("/student/check")
    public List<Student> checkData() {
        return service.getAllStudents();
}}
