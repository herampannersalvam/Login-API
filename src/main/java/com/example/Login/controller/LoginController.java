package com.example.Login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Login.commen.APIResponse;
import com.example.Login.entity.Login;
import com.example.Login.service.LoginService;

@RestController
@RequestMapping("/api/login")
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@PostMapping("/token")
	public ResponseEntity<APIResponse>posttoker(@RequestBody Login login){
		APIResponse apiResponse=loginService.posttoken(login);
		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
		
	}
}
