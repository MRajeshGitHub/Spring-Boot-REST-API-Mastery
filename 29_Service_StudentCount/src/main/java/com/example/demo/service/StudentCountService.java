package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;

@Service
public class StudentCountService {

	
	private List<Student> studentList = new ArrayList<>();

    // कंस्ट्रक्टर में शुरुआती 2 छात्रों का डेटा डाल दिया
    public StudentCountService() {
        studentList.add(new Student(101, "Rajesh Kumar"));
        studentList.add(new Student(102, "Amit Sharma"));
    }

    // 🌟 कुल छात्रों की संख्या गिनने का लॉजिक
    public int getTotalStudentCount() {
        System.out.println(">>> [Service Layer] काउंटिंग शुरू हुई...");
        
        // ऑब्जेक्ट-बेस्ड कलेक्शन का इन-बिल्ट मेथड .size() कुल संख्या देता है
        int total = studentList.size(); 
        
        System.out.println(">>> [Service Layer] कुल छात्र मिले: " + total);
        return total;
    }
}
