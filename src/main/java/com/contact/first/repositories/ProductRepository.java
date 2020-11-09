package com.contact.first.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contact.first.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {}
