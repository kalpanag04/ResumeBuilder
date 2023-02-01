package com.te.resumebuilder.dto;

import com.te.resumebuilder.entity.Profile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EducationDetailsDto {

	private String education;

	private String specialization;

	private String university;

	private Integer passOutYear;

	private Double percentage;
	

}
