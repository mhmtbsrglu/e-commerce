package com.trenddolabim.backendservices.product.domain.elasticsearch;

import org.springframework.data.elasticsearch.annotations.Document;

import com.trenddolabim.backendservices.product.domain.ProductPrice;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Document(indexName = "Urun")
@Getter
@Setter 
@EqualsAndHashCode(of = "id")
public class ProductEs {

    private String id;
    private CategoryEs category;
    private SellerEs seller;
    private String productName;
    private String productCode;
    private String productImage;
    private Boolean isActive;
    private String description;
    private ProductPrice productPrice;
    private String color;

}
