package com.microservicedemo.productservice.service;

import org.springframework.stereotype.Service;

import com.microservicedemo.productservice.dto.ProductRequest;
import com.microservicedemo.productservice.model.Product;
import com.microservicedemo.productservice.repository.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
	
	private final ProductRepository productRepository;
	
	public void createProduct(ProductRequest productRequest) {
		Product product = Product.builder()
				.name(productRequest.getName())
				.description(productRequest.getDescription())
				.price(productRequest.getPrice())
				.build();
		
		// save the product
		productRepository.save(product);
		log.info("Product {} is saved", product.getId());
	}
}
