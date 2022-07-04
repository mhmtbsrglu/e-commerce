package com.trenddolabim.backendservices.product.model;

import java.math.BigDecimal;
import java.util.List;

import com.trenddolabim.backendservices.product.domain.ProductImage;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ProductResponse {
    private String id;
    private String categoryId;
    private ProductSellerResponse seller;
    private String productName;
    private String productCode;
    private String productImage;
    private Boolean isActive;
    private String description;
    private BigDecimal productPrice;
    private String color;

}
