package com.te.resumebuilder.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
@Table(name = "project_details")
public class ProjectDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int projectId;

	@Column(name = "frontend_technologies")
	@ElementCollection
	private List<String> projectFrontEndTechnologies;

	@Column(name = "backend_technologies")
	@ElementCollection
	private List<String> projectBackendTechnologies;

	@Column(name = "project_design_patterns")
	@ElementCollection
	private List<String> projectDesignPatterns;

	@Column(name = "project_database")
	@ElementCollection
	private List<String> projectDatabase;

	@Column(name = "project_dev_tools")
	@ElementCollection
	private List<String> projectDevelopmentTools;

	@Column(name = "project_duration")
	private String projectDuration;

	@Column(name = "team_size")
	private int projectTeamSize;

	@Column(name = "project_description")
	private String projectDescription;

	@Column(name = "roles_and_responsibilties")
	private String projectRolesAndResponsibilities;

}
