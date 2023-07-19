package com.tech.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tech.products.entity.ProductEntity;
import com.tech.products.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService pros;
	
	@PostMapping(value="/setproduct")
	public String setProduct(@RequestBody ProductEntity a) {
		return pros.setProduct(a);
		
	}
	@PostMapping(value="setallproduct")
	public String setallProduct(@RequestBody List<ProductEntity>a) {
		return pros.setallProduct(a);
	}
	
	@GetMapping(value="/getpricebyid/{a}")
	public ProductEntity getpricebyid(@PathVariable int a) {
		return pros.getpricebyid(a);
		
	}
	@GetMapping(value="/getallproduct")
	public List<ProductEntity> getallproduct(){
		return pros.getallproduct();
	}

}
