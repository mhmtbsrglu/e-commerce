package com.trenddolabim.backendservices.product.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.trenddolabim.backendservices.product.domain.Product;

public interface ProductRepository extends ReactiveMongoRepository<Product,String>{
    
}
