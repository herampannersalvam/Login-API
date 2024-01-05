package com.example.Login.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Login.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,UUID> {

	Optional<User> findByUserName(String userName);

	//Optional<User> findByName(String userName);

}
