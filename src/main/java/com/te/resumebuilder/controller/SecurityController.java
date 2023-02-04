package com.te.resumebuilder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.resumebuilder.dto.MyUserDto;
import com.te.resumebuilder.response.AppResponse;
import com.te.resumebuilder.service.MyUserDetailsService;

@RestController
public class SecurityController {
	
	@Autowired
	private AppResponse appResponse;
	
	@Autowired
	private MyUserDetailsService myUserDetailsService;
	
	@RequestMapping("/addUser")
	public ResponseEntity<AppResponse> addUser(@RequestBody MyUserDto myUserDto) {
		MyUserDto userDto=myUserDetailsService.addUser(myUserDto);
		
		if (userDto != null) {
			appResponse.setError(false);
			appResponse.setMessage("Resume created successfully");
			appResponse.setStatus(201);
			appResponse.setData(userDto);

			return new ResponseEntity<AppResponse>(appResponse, HttpStatus.OK);
		} else {
			appResponse.setError(true);
			appResponse.setMessage("Resume not created");
			appResponse.setStatus(402);
			appResponse.setData(userDto);

			return new ResponseEntity<AppResponse>(HttpStatus.BAD_REQUEST);
		}
	}

}
