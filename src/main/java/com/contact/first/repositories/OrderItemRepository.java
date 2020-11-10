package com.contact.first.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contact.first.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {}
