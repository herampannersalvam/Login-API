package com.example.Login.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Login.entity.User;
import com.example.Login.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/post")
	public String create(@RequestBody List<User> user){
		 userService.create(user);
		 return "POST SUCCESSFULLY";
		}
	@GetMapping("/getAll")
	public List<User> getAll() {
		return userService.getALL();
	}
	@GetMapping("/getById/{id}")
	public Optional<User> getById(@PathVariable ("id") UUID id) {
		return userService.getById(id);
	}
	@GetMapping("/getByName/{getByName}")
	public Optional<User> getByName(@PathVariable ("getByName") String userName) {
		return userService.getByName(userName);
	}
	

}
