package com.trenddolabim.backendservices.product.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.trenddolabim.backendservices.product.domain.ProductPrice;

public interface ProductPriceRepository extends ReactiveMongoRepository<ProductPrice,String>{
    
}
