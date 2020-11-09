package com.contact.first.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contact.first.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {}
