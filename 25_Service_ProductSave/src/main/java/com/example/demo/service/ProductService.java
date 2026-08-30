package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Product;

@Service
public class ProductService {

	
	private List<Product> list= new ArrayList<>();
	
	public String addProduct(Product product) {
		
		list.add(product);
		System.out.println("Product add in list..."+product.getPname());
		
		return "Product added here :"+product.getPname()+"Product Price is :"+product.getPcost()
		+"Product count in list is :"+list.size();
	}
}
