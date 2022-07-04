package com.trenddolabim.backendservices.product.domain.elasticsearch;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SellerEs {
    private String id;
    private String name;
    private String code;
}
