package com.example.Login.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.Login.commen.APIResponse;
import com.example.Login.entity.Login;
import com.example.Login.repository.LoginRepository;
import com.example.Login.util.jwtUtil;

@Service
public class LoginService {

	@Autowired
	LoginRepository loginRepository;
	
	@Autowired
	jwtUtil JwtUtil;
	public APIResponse posttoken(Login login) {
		// TODO Auto-generated method stub
		APIResponse apiRespons=new APIResponse();
		
		Login UserLogin =loginRepository.findAllLogin(login.getUserEmail(),login.getUserPassword());
		
		if(UserLogin!=null) {
			apiRespons.setStatus(HttpStatus.OK.value());
			String token= JwtUtil.generatejwt(UserLogin);
			Map<Object, Object> data = new HashMap<Object, Object>();
			data.put("Token", token);
			data.put("message", "Logged in successfully");
			System.out.println(token);
			apiRespons.setData(data);
			return apiRespons;
		}else {
			apiRespons.setData("User login failed");
			apiRespons.setStatus(HttpStatus.BAD_REQUEST.value());
			apiRespons.setError("incorrect passward or emailId");
			return apiRespons;
		}
	}

}
