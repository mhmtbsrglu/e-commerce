package com.trenddolabim.backendservices.product.domain.elasticsearch;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Document(indexName = "product")
@Getter
@Setter 
@Builder
@EqualsAndHashCode(of = "id")
public class ProductEs {

    private String id;
    private CategoryEs category;
    private SellerEs seller;
    private String productName;
    private String productCode;
    private List<String> productImages;
    private Boolean isActive;
    private String description;
    private BigDecimal productPrice;
    private String color;
    private int quantity;

}
