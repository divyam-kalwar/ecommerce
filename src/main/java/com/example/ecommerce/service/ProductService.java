package com.example.ecommerce.service;

import com.example.ecommerce.models.Product;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    Product getProductById(Long id);
}
