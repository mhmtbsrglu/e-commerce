package com.trenddolabim.backendservices.product.repository.elasticsearach;

import org.springframework.data.elasticsearch.repository.ReactiveElasticsearchRepository;

import com.trenddolabim.backendservices.product.domain.elasticsearch.ProductEs;

public interface ProductEsRepository extends ReactiveElasticsearchRepository<ProductEs,String>{
    
}
