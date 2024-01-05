package com.example.Login.entity;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
		@Id
		@GeneratedValue(generator = "UUID")
		@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
		private UUID id;
	
		@Column(name = "name")
		private String userName;
	
		@Column(name = "email")
		private String userEmail;
	
		@Column(name = "mobile")
		private long userMobile;
	
		@Column(name = "password")
		private String userPassword;
	
		@Column(name = "gender")
		private char userGender;
	
		@Column(name = "dob")
		private String userDob;


}
