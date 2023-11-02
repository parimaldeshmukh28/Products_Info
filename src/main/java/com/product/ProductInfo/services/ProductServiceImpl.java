package com.product.ProductInfo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.ProductInfo.model.Product;
import com.product.ProductInfo.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo productRepo;

	@Override
	public List<Product> getProductDetails() {
		// TODO Auto-generated method stub
		List<Product> prductList = productRepo.findAll();
		return prductList;
	}

}
