package com.example.ecommerce.service;

import com.example.ecommerce.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.restclient.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
//    private RestTemplate restTemplate;
    private RestTemplateBuilder restTemplateBuilder;

    @Override
    public Product getProductById(Long id){
        //TODO: Implement this service
        RestTemplate restTemplate = restTemplateBuilder.build();
        return null;
    }
}
