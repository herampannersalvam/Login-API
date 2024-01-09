package com.example.Login.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Login.entity.FilesUploadResponse;



@Repository
public interface FileUploadRepository extends JpaRepository<FilesUploadResponse,UUID>{

	Optional<FilesUploadResponse> findByName(String fileName);

	
	
}
