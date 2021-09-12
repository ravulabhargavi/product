package com.htc.product.presistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htc.product.entity.Product;

@Repository
public interface IProduct extends JpaRepository<Product,Long>{
	/*
	 * public Product getProduct(String productId); public List<Product>
	 * getProductsByName(String name); public Product createProduct(Product
	 * product); public Product createProduct(String Name,float weight);
	 */
}
