//package com.te.resumebuilder.advice;
//
//import org.apache.catalina.connector.Response;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.MethodArgumentNotValidException;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//import com.te.resumebuilder.response.AppResponse;
//
//@RestControllerAdvice
//public class ExceptionController {
//
//	@Autowired
//	private AppResponse appResponse;
//	
//	@ExceptionHandler
//	public ResponseEntity<AppResponse> UsernameNotFoundException(org.springframework.security.core.userdetails.UsernameNotFoundException exception){
//		appResponse.setStatus(404);
//		appResponse.setMessage(exception.getMessage());
//		
//		return new ResponseEntity<AppResponse>(appResponse,HttpStatus.NOT_FOUND);
//	}
//	
//	
//}
