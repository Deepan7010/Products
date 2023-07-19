package com.tech.products.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.tech.products.dao.ProductDao;
import com.tech.products.entity.ProductEntity;

@Service
public class ProductService {
	@Autowired
	ProductDao prod;
	
	public String setProduct(ProductEntity a) {
		return prod.setProduct(a);
	}
	public String setallProduct(List<ProductEntity>a) {
		return prod.setallProduct(a);
	}
	public ProductEntity getpricebyid(int a) {
		return prod.getpricebyid(a);
		
	}
	public List<ProductEntity> getallproduct(){
		return prod.getallproduct();
	}

}
