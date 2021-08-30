package com.oscarmagana.queerhealthappspringboot.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.oscarmagana.queerhealthappspringboot.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	Boolean existsByEmail(String email);
}
