package com.trenddolabim.backendservices.product.domain;


import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

/* Collection Mapping */

@NonNull
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collation = "Urun")
@EqualsAndHashCode(of = "id")
public class Product {
    
    private String id;
    private String categoryId;
    private String sellerId;
    private String productName;
    private String productCode;
    private List<ProductImage> productImage;
    private Boolean isActive;
    private String description;
    private ProductPrice productPrice;
    private String color;


}
