package com.te.resumebuilder.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDetailsDto {

	private List<String> projectFrontEndTechnologies;

	private List<String> projectBackendTechnologies;

	private List<String> projectDesignPatterns;

	private List<String> projectDatabase;

	private List<String> projectDevelopmentTools;

	private String projectDuration;

	private int projectTeamSize;

	private String projectDescription;

	private String projectRolesAndResponsibilities;
}
