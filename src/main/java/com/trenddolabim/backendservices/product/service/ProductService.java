package com.trenddolabim.backendservices.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.trenddolabim.backendservices.product.domain.elasticsearch.CategoryEs;
import com.trenddolabim.backendservices.product.domain.elasticsearch.ProductEs;
import com.trenddolabim.backendservices.product.model.ProductResponse;
import com.trenddolabim.backendservices.product.model.ProductSellerResponse;
import com.trenddolabim.backendservices.product.repository.ProductRepository;
import com.trenddolabim.backendservices.product.repository.elasticsearach.ProductEsRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class ProductService {

    @Autowired
    private final ProductEsRepository productEsRepository;
    private final ProductRepository productRepo;
    private final ProductDeliveryService productDeliveryService;
    
    public Flux<ProductResponse> getAll(){
        //1- Elastic search sorgula
        // 2 - Calc fieldları işle
        // redisten ihtiyaç alanlarını getir
        // 3 - Response nesnesine dönüştür
        return productEsRepository.findAll().map(this::mapToDto);
    }

    private ProductResponse mapToDto(ProductEs productEs){
        
        CategoryEs kategori_id = productEs.getCategory();

        return ProductResponse.builder()
        .id(productEs.getId())
        .categoryId(kategori_id.getId())
         .seller(ProductSellerResponse.builder().id(productEs.getSeller().getId()).name(productEs.getSeller().getName()).build())
         .productName(productEs.getProductName())
         .productCode(productEs.getProductCode())
         .productImage(productEs.getProductImages().get(0))
         .isActive(productEs.getIsActive())
         .description(productEs.getDescription())
         .productPrice(productEs.getProductPrice())
         .color(productEs.getColor())
        .productPrice(productEs.getProductPrice())
        .quantity(productEs.getQuantity())
        .deliveryIn(productDeliveryService.getDeliveryInfo(productEs.getId()))
        .freeDelivery(productDeliveryService.freeDeliveryCheck(productEs.getId(), productEs.getProductPrice()))
        .build();
        
    }



     
    // ProductResponse save(ProductSaveRequest psr){
    //     //1- Mongo DB yaz
    //     // 2 - Elastic searchten güncelle
    //     // Redisten güncelle varsa güncelle
    //     // 3 - Elastic searchten cevap dön
    //     // 4 - Response nesnesine dönüştür

    //     return null;
    // }
}
