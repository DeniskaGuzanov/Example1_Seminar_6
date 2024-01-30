package com.example.Example1_Seminar_6.service;

import com.example.Example1_Seminar_6.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();
    Product getProductById(Long id);

    Product updateProduct(Product product);


    Product createProduct(Product product);

    void deleteProduct(Long id);
}
