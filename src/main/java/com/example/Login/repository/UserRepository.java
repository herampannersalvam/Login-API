package com.example.Login.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Login.entity.Login;
import com.example.Login.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,UUID> {

	Optional<User> findByUserName(String userName);

	@Query(value = "SELECT * FROM user AS l WHERE l.email = :userEmail AND l.password = :userPassword", nativeQuery = true)
	User findAllLogin(String userEmail, String userPassword);

	//Optional<User> findByName(String userName);

}
