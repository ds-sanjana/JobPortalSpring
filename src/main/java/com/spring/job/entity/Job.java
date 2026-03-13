package com.spring.job.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor 
public class Job {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long jobId;

	private String jobTitle;

	private String jobDescription;

	private String location;

	private String salary;

	private String jobType;

	private String experienceRequired;

	private LocalDate postedDate;

	@ManyToOne  //Recruiter → Jobs
	@JoinColumn(name = "recruiterId")
	private Recruiter recruiter;

	@OneToMany(mappedBy = "job") //Job → Applications
	private List<Application> applications;

	}


