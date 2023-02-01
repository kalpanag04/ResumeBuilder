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
@Table(name = "achievement_details")
public class AchievementDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int achievementId;

	@Column(name = "achievement")
	@ElementCollection
	private List<String> achievement;
}
