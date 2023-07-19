package com.tech.products.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.products.entity.ProductEntity;
import com.tech.products.repository.ProductRepository;

@Repository
public class ProductDao {
	@Autowired
	ProductRepository pror;
	
	public String setProduct(ProductEntity a) {
		pror.save(a);
		return "successfully saved";
	}
	
	public String setallProduct(List<ProductEntity>a) {
		pror.saveAll(a);
		return "successfully all saved";
	}
	public ProductEntity getpricebyid(int a) {
	return pror.findById(a).get();
		
	}
	public List<ProductEntity> getallproduct(){
		return pror.findAll();
	}

}
