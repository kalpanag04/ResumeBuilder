package com.te.resumebuilder.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;

import lombok.Setter;
import lombok.ToString;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
@Table(name = "education_details")
public class EducationDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int educationId;

	@Column(name = "education")
	private String education;

	@Column(name = "specialization")
	private String specialization;

	@Column(name = "university")
	private String university;

	@Column(name = "pass_out_year")
	private Integer passOutYear;

	@Column(name = "percentage")
	private Double percentage;

	@ManyToOne
	@JsonBackReference
	private Profile eprofile;

}
