package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentDbService {

	@Autowired
	private StudentRepository repository;
	
	
	public String saveStudentToDb(Student student) {
		System.out.println("Db operation start...");
		
		Student saveStudent = repository.save(student);
		
		return "Student" + saveStudent.getName() + " का डेटाबेस में ID: " + saveStudent.getId() + " पर सुरक्षित सेव हो गया है!";
	}
}
