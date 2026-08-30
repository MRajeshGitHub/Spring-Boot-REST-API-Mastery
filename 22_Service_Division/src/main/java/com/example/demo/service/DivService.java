package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DivService {

	public int doDivision(int a,int b) {
		
		
		if(b==0) {
			System.out.println("Divsion by 0 please check");
			throw new ArithmeticException();
			
		}
		
		int result=a/b;
		return result;
	}
}
