package com.example.Login.entity;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class FilesUploadResponse {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID",strategy ="org.hibernate.id.UUIDGenerator") 
	private UUID id;
	
	private String fileName;
    
	private String fileType;
    
	private String filePath;

	

	
}
