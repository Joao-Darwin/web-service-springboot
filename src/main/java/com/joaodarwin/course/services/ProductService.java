package com.joaodarwin.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaodarwin.course.entities.Product;
import com.joaodarwin.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll(){
		return productRepository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = productRepository.findById(id);
		return obj.get();
	}
	
	public Product insert(Product product) {
		return productRepository.save(product);
	}
	
	public void delete(Long id) {
		productRepository.deleteById(id);
	}
	
	public Product update(Long id, Product product) {
		Product obj = productRepository.getReferenceById(id);
		updateProduct(obj, product);
		return productRepository.save(obj);
	}
	
	public void updateProduct(Product obj, Product product) {
		obj.setName(product.getName());
		obj.setPrice(product.getPrice());
		obj.setImgUrl(product.getImgUrl());
	}
}
