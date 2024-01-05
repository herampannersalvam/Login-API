package com.example.Login.entity;

import java.util.UUID;
import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Login {
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID",strategy ="org.hibernate.id.UUIDGenerator") 
	private UUID id;
	
	private String userName;
	
	private String userEmail;
	
	private String userPassword;
	
	private long userMobile;
	
	

}
