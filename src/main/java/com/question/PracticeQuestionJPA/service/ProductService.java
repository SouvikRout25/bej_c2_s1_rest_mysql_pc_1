package com.question.PracticeQuestionJPA.service;

import com.question.PracticeQuestionJPA.domain.Product;

import java.util.List;

public interface ProductService {

    Product addProduct(Product product);

    List<Product> getAllProducts();

    boolean deleteProductById(int productId);

    List<Product> getProductByProductId(int productId);
}