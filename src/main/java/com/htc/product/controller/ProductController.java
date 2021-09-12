package com.htc.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.product.entity.Product;
import com.htc.product.presistence.IProduct;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	private IProduct repo;
 
@GetMapping("/products/{id}")
Product getProduct(@PathVariable Long id)
{
	Product prod=null;
	prod=repo.findById(id).get();//Due to lazy loading in JPA instead of repo.getOne(id)
	return prod;
	
}

@PostMapping("/products")
Product createEmployee(@RequestBody Product prod)
{
	return repo.save(prod);
	
}


@Autowired
public void setRepo(IProduct repo) {
	this.repo = repo;
}
	
	
}
