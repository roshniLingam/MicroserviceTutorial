package com.microservicedemo.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microservicedemo.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
	
}