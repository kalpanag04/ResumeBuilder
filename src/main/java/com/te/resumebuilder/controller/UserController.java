package com.te.resumebuilder.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.resumebuilder.dto.ProfileDto;
import com.te.resumebuilder.dto.ProfileNewDto;
import com.te.resumebuilder.entity.Profile;
import com.te.resumebuilder.response.AppResponse;
import com.te.resumebuilder.service.AchievementDetailsService;
import com.te.resumebuilder.service.EducationDetailsService;
import com.te.resumebuilder.service.ProfileService;
import com.te.resumebuilder.service.ProjectDetailsService;
import com.te.resumebuilder.service.SkillsService;
import com.te.resumebuilder.service.SummaryService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/v1")
public class UserController {
	@Autowired
	private AppResponse appResponse;

	@Autowired
	private ProfileService profileService;
	
	@PostMapping("/addResume")
	public ResponseEntity<AppResponse> createResume(@RequestBody ProfileDto profileDto) {
		ProfileDto profile = profileService.createResume(profileDto);

		if (profile != null) {
			appResponse.setError(false);
			appResponse.setMessage("Resume created successfully");
			appResponse.setStatus(201);
			appResponse.setData(profile);

			return new ResponseEntity<AppResponse>(appResponse, HttpStatus.OK);
		} else {
			appResponse.setError(true);
			appResponse.setMessage("Resume not created");
			appResponse.setStatus(402);
			appResponse.setData(profile);

			return new ResponseEntity<AppResponse>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@PutMapping("/updateResume/{profileId}")
	public ResponseEntity<AppResponse> updateResume(@RequestBody ProfileNewDto profileNewDto,@PathVariable Integer profileId){
		Profile profile = profileService.updateResume(profileNewDto,profileId);

		if (profile != null) {
			appResponse.setError(false);
			appResponse.setMessage("Resume created successfully");
			appResponse.setStatus(201);
			appResponse.setData(profile);

			return new ResponseEntity<AppResponse>(appResponse, HttpStatus.OK);
		} else {
			appResponse.setError(true);
			appResponse.setMessage("Resume not created");
			appResponse.setStatus(402);
			appResponse.setData(profile);

			return new ResponseEntity<AppResponse>(HttpStatus.BAD_REQUEST);
		}
	}
	
	
	
}
