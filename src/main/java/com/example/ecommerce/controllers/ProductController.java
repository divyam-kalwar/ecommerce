package com.example.ecommerce.controllers;

import com.example.ecommerce.dtos.ProductDTO;
import com.example.ecommerce.models.Product;
import com.example.ecommerce.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products/{id}")
    public ProductDTO getProductById(@PathVariable("id") Long id /*ProductDTO requestDTO*/) {
        //TODO: Implementation pending
//        ProductDTO responseDTO = new ProductDTO();
//        try{
//            Product product = productService.getProductById(requestDTO.getId());
//            responseDTO.setId(product.getId());
//            responseDTO.setName(product.getName());
//            responseDTO.setPrice(product.getPrice());
//            responseDTO.setImageUrl(product.getImageUrl());
//            responseDTO.setDescription(product.getDescription());
//        }catch(Exception e){
//            // TODO
//            throw new IllegalArgumentException(e.getMessage());
//        }
//        return responseDTO;

        Product product = productService.getProductById(id);

        ProductDTO responseDTO = new ProductDTO();
        responseDTO.setId(product.getId());
        responseDTO.setName(product.getName());
        responseDTO.setPrice(product.getPrice());
        responseDTO.setImageUrl(product.getImageUrl());
        responseDTO.setDescription(product.getDescription());

        return responseDTO;

    }
}
