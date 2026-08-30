package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;

@Service
public class StudentService {
	
	private List<Student> list= new ArrayList<>();//temp database in-memory db
	
	public String addStudent(Student student) {
		
		System.out.println("Student save logic ...");
		
		list.add(student);
		System.out.println(list.size());
		
		return "Student is :-- "+student.getName()+"--Save student object";
	}

}
