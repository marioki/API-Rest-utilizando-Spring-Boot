package com.init.users.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.init.users.dao.UsersDAO;
import com.init.users.entity.User;

@RestController
@RequestMapping("/api/v1/users")
public class UserREST {

	@Autowired
	private UsersDAO usersDAO;

	// @GetMapping
	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public String hello() {
		return "Hello Mario";
	}

	@GetMapping
	public ResponseEntity<List<User>> getUsers() {
		List<User> users = usersDAO.findAll();

		return ResponseEntity.ok(users);
	}

	@RequestMapping(value = "{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") Long userId) {
		Optional<User> optionalUser = usersDAO.findById(userId);
		if (optionalUser.isPresent()) {
			return ResponseEntity.ok(optionalUser.get());
		} else {
			return ResponseEntity.noContent().build();
		}

	}

	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User newUser = usersDAO.save(user);

		return ResponseEntity.ok(newUser);
	}

	@DeleteMapping(value = "{id}")
	public ResponseEntity<Void> deleteUser(@PathVariable("id") Long userId) {
		usersDAO.deleteById(userId);
		return ResponseEntity.ok(null);
	}

	@PutMapping(value = "{id}")
	public ResponseEntity<User> updateUser(@PathVariable("id") Long userId, @RequestBody User user) {
		Optional<User> optionalUser = usersDAO.findById(userId);
		if (optionalUser.isPresent()) {
			User updatedUser = optionalUser.get();
			updatedUser.setName(user.getName());
			updatedUser.setLastName(user.getLastName());
			usersDAO.save(updatedUser);
			return ResponseEntity.ok(updatedUser);

		} else {
			return ResponseEntity.notFound().build();
		}
	}

}
