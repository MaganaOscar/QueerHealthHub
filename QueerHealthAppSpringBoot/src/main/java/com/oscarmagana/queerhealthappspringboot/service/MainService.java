package com.oscarmagana.queerhealthappspringboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oscarmagana.queerhealthappspringboot.model.User;
import com.oscarmagana.queerhealthappspringboot.repositories.UserRepository;

@Service
public class MainService {
	@Autowired
	private UserRepository userRepo;
	
	public User getUserById(Long id) {
		Optional<User> optUser = userRepo.findById(id);
		if(optUser.isPresent()) {
			return optUser.get();
		} else {
			return null;
		}
	}
	
	public User createUser(User user) {
		return userRepo.save(user);
	}
	
	public Boolean emailExists(String email) {
		return userRepo.existsByEmail(email);
	}
}
