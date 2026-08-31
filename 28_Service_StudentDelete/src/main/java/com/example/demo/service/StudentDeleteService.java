package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;

@Service
public class StudentDeleteService {

	
	private List<Student> studentList = new ArrayList<>();

    // कंस्ट्रक्टर के अंदर शुरुआती डेटा फीड किया
    public StudentDeleteService() {
        studentList.add(new Student(101, "Rajesh Kumar", "Hyderabad"));
        studentList.add(new Student(102, "Amit Sharma", "Varanasi"));
        studentList.add(new Student(103, "Suresh Yadav", "Varanasi"));
    }
    
    public String deleteStudentById(int searchId) {
        System.out.println(">>> [Service Layer] डिलीट करने की प्रक्रिया शुरू! खोजने वाली ID: " + searchId);
        
        // लूप चलाकर उस ऑब्जेक्ट को ढूंढेंगे जिसकी आईडी मैच हो रही है
        for (Student st : studentList) {
            if (st.getId() == searchId) {
                
                // ऑब्जेक्ट-बेस्ड मेथड: लिस्ट से इस ऑब्जेक्ट को हटा दो
                studentList.remove(st);
                
                System.out.println(">>> [Service Layer] छात्र का रिकॉर्ड सफलतापूर्वक डिलीट कर दिया गया है।");
                return "Student ID " + searchId + " का रिकॉर्ड सफलतापूर्वक डिलीट हो गया है! अब कुल छात्र बचे: " + studentList.size();
            }
        }
        
     // अगर लूप खत्म होने के बाद भी वह आईडी लिस्ट में नहीं मिली
        System.out.println(">>> [Service Layer] कड़ा अलर्ट: यह ID लिस्ट में मौजूद नहीं है!");
        return "त्रुटि: ID " + searchId + " का कोई छात्र मौजूद नहीं है!";
    }

    // पूरी लिस्ट देखने के लिए मेथड
    public List<Student> getAllStudents() {
        return studentList;
    
        
    }
}
