package com.trenddolabim.backendservices.product.domain.elasticsearch;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryEs {
    private String id;
    private String name;
}
