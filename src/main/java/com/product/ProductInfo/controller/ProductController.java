package com.product.ProductInfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.ProductInfo.model.Product;
import com.product.ProductInfo.services.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping(value = "/getAll")
	public List<Product> getProductData() {
		List<Product> plist = productService.getProductDetails();
		return plist;
	}

}
