package com.tech.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tech.products.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity,Integer>{

}
