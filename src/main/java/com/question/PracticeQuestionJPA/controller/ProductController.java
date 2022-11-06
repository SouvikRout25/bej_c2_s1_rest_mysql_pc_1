package com.question.PracticeQuestionJPA.controller;

import com.question.PracticeQuestionJPA.domain.Product;
import com.question.PracticeQuestionJPA.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productData")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping(value = "/product")
    public ResponseEntity<?> addProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.addProduct(product), HttpStatus.CREATED);
    }
    @GetMapping(value = "/products")
    public ResponseEntity<?> getAllProducts(){
        return new ResponseEntity<>(productService.getAllProducts(),HttpStatus.OK);
    }
    @DeleteMapping(value = "/product/{productId}")
    public ResponseEntity<?> deleteProduct(@PathVariable int productId){
        return new ResponseEntity<>(productService.deleteProductById(productId),HttpStatus.OK);
    }
    @GetMapping(value = "/product/{productId}")
    public ResponseEntity<?> getProductByProductId(@PathVariable int productId){
        return new ResponseEntity<>(productService.getProductByProductId(productId),HttpStatus.OK);
    }
}