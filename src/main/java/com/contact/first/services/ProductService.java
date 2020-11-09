package com.contact.first.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.first.entities.Product;
import com.contact.first.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
		
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById(Long ID) {
		Optional<Product> obj = repository.findById(ID);
		return obj.get();
	}
}
