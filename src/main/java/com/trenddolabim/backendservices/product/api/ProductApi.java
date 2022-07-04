package com.trenddolabim.backendservices.product.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trenddolabim.backendservices.product.model.ProductResponse;
import com.trenddolabim.backendservices.product.service.ProductService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

/**
 * ProductApi
 */

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ProductApi {

    public final ProductService productService;


    @GetMapping
    public Flux<ProductResponse> getAllProducts(){
        return productService.getAll();
    }

    
    
}