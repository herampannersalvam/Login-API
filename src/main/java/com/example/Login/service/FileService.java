package com.example.Login.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.Login.entity.FilesUploadResponse;
import com.example.Login.repository.FileUploadRepository;

@Service
public class FileService {

	@Autowired
	FileUploadRepository fileUploadRepository;
	
	private String folderName;
	 
	private final String FOLDER_PATH = "C:\\Users\\heram\\Jasper\\Login"+folderName;
	
	public String uploadImageToFileSystem(MultipartFile file)  throws IOException{
		// TODO Auto-generated method stub
		String filePath = FOLDER_PATH + file.getOriginalFilename();


		FilesUploadResponse fileData = fileUploadRepository.save(FilesUploadResponse.builder()
				.fileName(file.getName())
				.fileType(file.getContentType())
				.filePath(filePath)
				.build());

		file.transferTo(new File(filePath));

		if (fileData != null) {
			return "file uploaded successfully : " + filePath;
		}
		return "Fieled";
	}
	
	public byte[] downloadImageFromFileSystem(String fileName) throws IOException {
		Optional<FilesUploadResponse> fileData = fileUploadRepository.findByName(fileName);
		String filePath = fileData.get().getFilePath();
		byte[] images = Files.readAllBytes(new File(filePath).toPath());
		return images;
	}
	

}
