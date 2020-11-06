package com.contact.first.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contact.first.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {}
