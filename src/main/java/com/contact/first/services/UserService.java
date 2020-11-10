package com.contact.first.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.first.entities.User;
import com.contact.first.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
		
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long ID) {
		Optional<User> obj = repository.findById(ID);
		return obj.get();
	}
	
	public User insert(User u) {
		return repository.save(u);
	}
	
	public void delete(Long ID) {
		repository.deleteById(ID);
	}
	
	public User update(Long ID, User u) {
		User entity = repository.getOne(ID);
		updateData(entity, u);
		return repository.save(entity);
	}

	private void updateData(User entity, User u) {
		entity.setName(u.getName());
		entity.setEmail(u.getEmail());
		entity.setPhone(u.getPhone());
	}
}
