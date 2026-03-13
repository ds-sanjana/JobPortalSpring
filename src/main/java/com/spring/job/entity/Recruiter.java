package com.spring.job.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recruiter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long recruiterId;

	private String companyName;

	private String email;

	private String password;

	private String phone;

	private String location;

	private String companyDescription;

	@OneToMany(mappedBy = "recruiter")  //One Recruiter → Many Jobs
	private List<Job> jobs;

	}


