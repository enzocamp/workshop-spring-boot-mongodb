package com.enzocamp.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enzocamp.workshopmongo.domain.User;
import com.enzocamp.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	public List<User> findAll(){
		return repo.findAll();
	}
}
