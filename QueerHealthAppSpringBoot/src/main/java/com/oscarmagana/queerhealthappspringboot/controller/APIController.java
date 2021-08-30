package com.oscarmagana.queerhealthappspringboot.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oscarmagana.queerhealthappspringboot.model.User;
import com.oscarmagana.queerhealthappspringboot.service.MainService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class APIController {
	@Autowired
	private MainService mainServ;
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable("id") Long id) {
		User user = mainServ.getUserById(id);
		return user;
	}
	
	@PostMapping("/registerTest")
	public User registerTest(@Valid @RequestBody User user) {
		User newUser = mainServ.createUser(user);
		return newUser;
	}

}
