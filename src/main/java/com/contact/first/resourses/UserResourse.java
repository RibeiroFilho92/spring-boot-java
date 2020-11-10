package com.contact.first.resourses;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.contact.first.entities.User;
import com.contact.first.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResourse {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{ID}")
	public ResponseEntity<User> findById(@PathVariable Long ID) {
		User obj = service.findById(ID);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<User> insert(@RequestBody User u) {
		u = service.insert(u);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{ID}").buildAndExpand(u.getID()).toUri();
		return ResponseEntity.created(uri).body(u);
	}
}
