package com.contact.first.resourses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.first.entities.Product;
import com.contact.first.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResourse {
	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{ID}")
	public ResponseEntity<Product> findById(@PathVariable Long ID) {
		Product obj = service.findById(ID);
		return ResponseEntity.ok().body(obj);
	}
}
