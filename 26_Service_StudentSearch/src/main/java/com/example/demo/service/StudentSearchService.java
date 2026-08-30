package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;

@Service
public class StudentSearchService {
	
	private List<Student> list=new ArrayList<>();//In-Memory-DB
	
	public StudentSearchService() {
        list.add(new Student(1, "Rajesh Kumar", "Varanasi"));
        list.add(new Student(2, "Amit Sharma", "Hyderabad"));
        list.add(new Student(3, "Suresh Yadav", "Varanasi"));
    }
	//business logic for searching..
	
	public List<Student> searchByCityName(String searchCity){
		System.out.println("Service layer start  city name"+searchCity);
		
		List<Student> resultList = new ArrayList<>();
		
		// for-each लूप लगाकर एक-एक छात्र का शहर चेक करेंगे
        for (Student st : list) {
            // इग्नोर केस (equalsIgnoreCase) ताकि छोटे-बड़े अक्षरों से फर्क न पड़े
            if (st.getCity().equalsIgnoreCase(searchCity)) {
                resultList.add(st); // अगर शहर मैच हुआ, तो परिणाम वाली लिस्ट में डालो
            }
        }
        
        System.out.println(">>> [Service Layer] सर्च पूरी हुई! कुल मिले छात्र: " + resultList.size());
        return resultList; // केवल छाने हुए छात्रों की लिस्ट वापस भेजी
	}

}
