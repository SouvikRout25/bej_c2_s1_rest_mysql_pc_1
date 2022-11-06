package com.question.PracticeQuestionJPA.repository;

import com.question.PracticeQuestionJPA.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    List<Product> findByProductId(int productId);
}