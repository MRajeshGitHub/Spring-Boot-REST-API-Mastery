package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MutateService {

	public int doMultiplication(int a,int b) {
		int result=a*b;
		return result;
	}
}
