package com.contact.first.resourses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.first.entities.Category;
import com.contact.first.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResourse {
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{ID}")
	public ResponseEntity<Category> findById(@PathVariable Long ID) {
		Category obj = service.findById(ID);
		return ResponseEntity.ok().body(obj);
	}
}
