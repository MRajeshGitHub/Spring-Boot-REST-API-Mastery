package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CalcService {
	
	public int doAddtion(int a,int b) {
		System.out.println(">>Service methos hit addtion a and b");
		return a+b;
	}

}
