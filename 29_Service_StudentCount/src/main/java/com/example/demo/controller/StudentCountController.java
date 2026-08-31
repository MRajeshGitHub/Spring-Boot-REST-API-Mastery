package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StudentCountService;

@RestController
public class StudentCountController {

	@Autowired
    private StudentCountService countService;

    // 🌟 काउंट एंडपॉइंट: http://localhost:8080/student/count
    @GetMapping("/student/count")
    public String getCount() {
        System.out.println(">>> [Controller Layer] COUNT रिक्वेस्ट प्राप्त हुई!");
        
        int totalStudents = countService.getTotalStudentCount();
        
        // यूजर को एक साफ और सुंदर संदेश वापस भेजना
        return "सर्वर पर मौजूद कुल छात्रों की संख्या (Total Students) है: " + totalStudents;
    }
}
