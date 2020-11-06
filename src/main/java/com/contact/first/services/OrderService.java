package com.contact.first.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.first.entities.Order;
import com.contact.first.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
		
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long ID) {
		Optional<Order> obj = repository.findById(ID);
		return obj.get();
	}
}
