package com.te.resumebuilder.response;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class AppResponse {
	private boolean Error;
	
	private int status;
	
	private String message;
	
	private Object data;
}
