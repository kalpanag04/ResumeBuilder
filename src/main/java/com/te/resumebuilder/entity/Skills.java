package com.te.resumebuilder.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
@Table(name = "skills")
public class Skills {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int skillId;

	@Column(name = "frontend_technologies")
	@ElementCollection
	private List<String> frontEndTechnologies;

	@Column(name = "backend_technologies")
	@ElementCollection
	private List<String> backEndTechnologies;

	@Column(name = "middleware_technologies")
	@ElementCollection
	private List<String> middlewareTechnologies;

	@Column(name = "skill_design_patterns")
	@ElementCollection
	private List<String> designPatterns;

	@Column(name = "skill_database_used")
	@ElementCollection
	private List<String> database;

	@Column(name = "version_control_system")
	@ElementCollection
	private List<String> versionControlSystem;

	@Column(name = "aws")
	@ElementCollection
	private List<String> aws;

	@Column(name = "sdlc")
	@ElementCollection
	private List<String> sdlc;

	@Column(name = "development_tools")
	@ElementCollection
	private List<String> developmentTools;

	@OneToOne
	@JsonBackReference
	private Profile profile;
}
