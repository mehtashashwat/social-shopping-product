package com.socialshopping.product.repository;

import com.socialshopping.product.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ProductRepository extends CrudRepository<Product, Long> {
    Optional<Product> findById(Long id);
    List<Product> findByName(String name);
    Optional<Product> findByBarcode(String barcode);
}
