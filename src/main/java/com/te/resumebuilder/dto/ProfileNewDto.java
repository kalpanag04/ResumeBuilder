package com.te.resumebuilder.dto;

import java.util.List;

import com.te.resumebuilder.entity.AchievementDetails;
import com.te.resumebuilder.entity.EducationDetails;
import com.te.resumebuilder.entity.ProjectDetails;
import com.te.resumebuilder.entity.Skills;
import com.te.resumebuilder.entity.Summary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfileNewDto {


	String totalExperience;

	String relevantExperience;


	private Skills skills;

//	private List<EducationDetails> educationDetails;

	private List<ProjectDetails> projectDetails;

}
