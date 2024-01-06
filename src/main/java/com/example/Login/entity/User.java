package com.example.Login.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

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
