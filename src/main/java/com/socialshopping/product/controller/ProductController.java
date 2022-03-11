package com.socialshopping.product.controller;

import com.socialshopping.product.entity.Product;
import com.socialshopping.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/name")
    public String saveProduct() {
        productRepository.save(new Product( "Name11", "Barcode1"));
        productRepository.save(new Product( "Name21", "Barcode2"));

        return productRepository.findByName("Name2").toString();
    }
}
