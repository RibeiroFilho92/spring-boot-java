package com.contact.first.resourses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.first.entities.Order;
import com.contact.first.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResourse {
	@Autowired
	private OrderService service;

	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{ID}")
	public ResponseEntity<Order> findById(@PathVariable Long ID) {
		Order obj = service.findById(ID);
		return ResponseEntity.ok().body(obj);
	}
}
