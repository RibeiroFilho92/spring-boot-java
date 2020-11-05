package com.contact.first.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contact.first.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {}
