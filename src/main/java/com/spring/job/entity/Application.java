package com.spring.job.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Application {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long applicationId;

	@ManyToOne //User → Applications
	@JoinColumn(name = "userId")
	private User user;

	@ManyToOne //Job → Applications
	@JoinColumn(name = "jobId")
	private Job job;

	private String resumePath;

	private String status;

	private LocalDate appliedDate;

	}


