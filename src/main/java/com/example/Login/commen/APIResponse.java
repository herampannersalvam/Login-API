package com.example.Login.commen;

import lombok.Data;

@Data
public class APIResponse {

	private Integer status;
	
	private Object data;
	
	private Object error;
}
