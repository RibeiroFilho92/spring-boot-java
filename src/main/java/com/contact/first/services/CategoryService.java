package com.contact.first.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.first.entities.Category;
import com.contact.first.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
		
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(Long ID) {
		Optional<Category> obj = repository.findById(ID);
		return obj.get();
	}
}
