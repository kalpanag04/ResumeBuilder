package com.te.resumebuilder.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "profile")
public class Profile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int profileId;

	@Column(name = "first_name", length = 20)
	private String firstName;

	@Column(name = "last_name", length = 20)
	private String lastName;

	@Column(name = "technology")
	@ElementCollection
	private List<String> technology;

	@Column(name = "total_experience")
	private String totalExperience;

	@Column(name = "relevant_experience")
	private String relevantExperience;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Summary> summary;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "profile")
	private Skills skills;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "eprofile")
	private List<EducationDetails> educationDetails;

	@OneToMany(cascade = CascadeType.ALL)
	private List<ProjectDetails> projectDetails;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="achievement_id")
	private AchievementDetails achievementDetails;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private MyUser myUser;
}
