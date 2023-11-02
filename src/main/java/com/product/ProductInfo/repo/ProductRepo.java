package com.product.ProductInfo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.ProductInfo.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
