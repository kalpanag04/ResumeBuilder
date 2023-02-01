package com.te.resumebuilder.entity;

import javax.persistence.Column;
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
@Table(name = "summary")
public class Summary {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int summaryId;

	@Column(name = "summary")
	private String summaryDetails;
	
	

}
