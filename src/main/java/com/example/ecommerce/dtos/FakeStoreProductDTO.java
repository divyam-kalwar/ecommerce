package com.example.ecommerce.dtos;

import com.example.ecommerce.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class FakeStoreProductDTO {
    private Long id;
    private String title;
    private Double price;
    private String description;
    private Category category;
    private String image;
}
