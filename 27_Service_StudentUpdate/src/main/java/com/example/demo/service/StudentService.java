package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;

@Service
public class StudentService {

	
	private List<Student> list= new ArrayList<>();//in memory DB

	public StudentService() {
		
		list.add(new Student(1, "Rajesh", "Varanasi"));
	}
	
	//update logic
	
	public String updateStudentDetails(Student incomeStd) {
		System.out.println("update process started here...."+incomeStd);
		
		for(Student s: list) {
		
			if(s.getId()==incomeStd.getId()) {
				
				incomeStd.setName(incomeStd.getName());
				
				incomeStd.setCity(incomeStd.getCity());
			
			System.out.println("Data updated...");
			
			return "Student Id is "+incomeStd.getId()+" data updated ";
		}
		
	}
	
	return "no id avaliable here"+incomeStd.getId();
	
	}
	
	public List<Student> getAllStudents() {
        return list;
    }
}
