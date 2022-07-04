package com.trenddolabim.backendservices.product.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

@NonNull
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collation = "Urun_Fiyati")
@EqualsAndHashCode(of = "id")
public class ProductPrice {
    private String id;
    private String productId;
    
    private String productPrice;
    private String discountPrice;
}
