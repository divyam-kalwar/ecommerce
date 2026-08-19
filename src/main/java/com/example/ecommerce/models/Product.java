package com.example.ecommerce.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Entity
public class Product extends BaseModel {
    private String name;
    private String imageUrl;
    private String description;
    private Double price;
    private Integer quantity;
//    @ManyToOne
    private Category category;
//    private Boolean isSaleActive;
}
