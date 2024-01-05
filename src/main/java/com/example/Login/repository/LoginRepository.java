package com.example.Login.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Login.entity.Login;

public interface LoginRepository extends JpaRepository<Login,UUID>{

	@Query(value = "SELECT * FROM user AS l WHERE l.email = :userEmail AND l.password = :userPassword", nativeQuery = true)
	Login findAllLogin(@Param("userEmail") String userEmail, @Param("userPassword") String userPassword);

	
	
	
	
	
	

	
	
}
