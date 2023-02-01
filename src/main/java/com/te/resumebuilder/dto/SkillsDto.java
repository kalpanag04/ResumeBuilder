package com.te.resumebuilder.dto;

import java.util.List;
import com.te.resumebuilder.entity.Profile; 
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SkillsDto {

	private List<String> frontEndTechnologies;

	private List<String> backEndTechnologies;

	private List<String> middlewareTechnologies;

	private List<String> designPatterns;

	private List<String> database;

	private List<String> versionControlSystem;

	private List<String> aws;

	private List<String> sdlc;

	private List<String> developmentTools;

}
