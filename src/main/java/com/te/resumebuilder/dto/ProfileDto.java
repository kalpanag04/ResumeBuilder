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
public class ProfileDto {
	private int profileId;

	private String firstName;

	private String lastName;

	private List<String> technology;

	private String totalExperience;

	private String relevantExperience;

	private List<SummaryDto> summaryDto;

	private SkillsDto skillsDto;

	private List<EducationDetailsDto> educationDetailsDto;

	private List<ProjectDetailsDto> projectDetailsDto;

	private AchievementDetailsDto achievementDetailsDto;
}
