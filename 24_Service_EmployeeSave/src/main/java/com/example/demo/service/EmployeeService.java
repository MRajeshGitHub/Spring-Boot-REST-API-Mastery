package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

@Service
public class EmployeeService {

private List<Employee> list= new ArrayList<>();//IN-Memory DB
	
	public String addEmployee(Employee employee) {
		
		
		System.out.println("Emp save steps...."+employee.getName());
		list.add(employee);
		System.out.println("Employee count is :"+list.size());
		
		return "Employee is "+employee.getName()+" Designation : "
		+employee.getDesignation()+"save emp count is :"+list.size();
}
}
