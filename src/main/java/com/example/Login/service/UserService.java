package com.example.Login.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Login.entity.User;
import com.example.Login.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public List<User> create(List<User> user) {
		// TODO Auto-generated method stub
		return userRepository.saveAll(user);
	}

	public List<User> getALL() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	public Optional<User> getById(UUID id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	public Optional<User> getByName(String userName) {
		// TODO Auto-generated method stub
		return userRepository.findByUserName(userName);
	}

	
	
	
}
