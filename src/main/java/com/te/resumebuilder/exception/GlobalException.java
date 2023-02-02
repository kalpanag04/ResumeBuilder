package com.te.resumebuilder.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.te.resumebuilder.response.GlobalResponse;

@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(ResumeProfileIdNotFoundException.class)
	public ResponseEntity<GlobalResponse> ResumeProfileIdNotFoundExceptionHandler(
			ResumeProfileIdNotFoundException exception) {
		String message = exception.getMessage();
		GlobalResponse globalResponse = new GlobalResponse(false, message);
		return new ResponseEntity<GlobalResponse>(globalResponse, HttpStatus.NOT_FOUND);
	}
}
