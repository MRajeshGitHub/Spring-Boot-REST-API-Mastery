package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentDeleteService;

@RestController
public class StudentDeleteController {

	@Autowired
    private StudentDeleteService deleteService;

    // 🌟 डिलीट एंडपॉइंट: http://localhost:8080/student/delete/102
    @DeleteMapping("/student/delete/{id}") // 👈 {id} एक डायनेमिक पाथ है
    public String removeStudent(@PathVariable int id) {
        System.out.println(">>> [Controller Layer] DELETE रिक्वेस्ट प्राप्त हुई! ID: " + id);
        
        // कंट्रोलर ने पाथ से आईडी खींचकर सीधे सर्विस लेयर को सौंप दी
        return deleteService.deleteStudentById(id);
    }

    // लिस्ट चेक करने के लिए गेट एंडपॉइंट
    @GetMapping("/student/all")
    public List<Student> checkData() {
        return deleteService.getAllStudents();
    }
}
