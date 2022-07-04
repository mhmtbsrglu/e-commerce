package com.trenddolabim.backendservices.product.service;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.trenddolabim.backendservices.product.model.ProductResponse;
import com.trenddolabim.backendservices.product.model.ProductSaveRequest;
import com.trenddolabim.backendservices.product.repository.ProductRepository;
import com.trenddolabim.backendservices.product.repository.elasticsearach.ProductEsRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductEsRepository productEsRepository;
    private final ProductRepository productRepo;
    
    List<ProductResponse> getByPaging(Pageable pageable){
        //1- Elastic search sorgula
        // 2 - Calc fieldları işle
        // redisten ihtiyaç alanlarını getir
        // 3 - Response nesnesine dönüştür

        return null;
    }

     
    ProductResponse save(ProductSaveRequest psr){
        //1- Mongo DB yaz
        // 2 - Elastic searchten güncelle
        // Redisten güncelle varsa güncelle
        // 3 - Elastic searchten cevap dön
        // 4 - Response nesnesine dönüştür

        return null;
    }
}
