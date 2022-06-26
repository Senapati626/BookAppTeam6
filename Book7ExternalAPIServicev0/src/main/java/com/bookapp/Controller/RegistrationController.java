package com.bookapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.Entity.User;
import com.bookapp.Repository.RegistrationRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping()
public class RegistrationController {

	@Autowired
	private RegistrationRepository registrationRepository;

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return registrationRepository.findAll();
	}

	@GetMapping("users/{id}")
	public User getUserById(@PathVariable(value = "id") Long userId) {
		return registrationRepository.findById(userId).get();
	}

	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return registrationRepository.save(user);
	}

	@PutMapping("users/{id}")
	public User updateUser(@PathVariable(value = "id") Long userId, @RequestBody User user) {
		User newUser = registrationRepository.findById(userId).get();
		newUser.setUserName(user.getUserName());
		newUser.setPassword(user.getPassword());
		return registrationRepository.save(newUser);
	}
}
