package com.example.Login.dto;

import java.util.UUID;

import lombok.Data;

@Data
public class UserDto {

	private UUID id;

	
	private String userName;

	
	private String userEmail;

	
	private long userMobile;

	
	private String userPassword;

	
	private char userGender;

	
	private String userDob;
}
