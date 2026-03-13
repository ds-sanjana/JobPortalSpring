package com.spring.job.service;

import java.util.List;

import com.spring.job.entity.Job;

public interface JobService {
	 void saveJob(Job job);

	    List<Job> getAllJobs();

	    Job getJobById(Long id);

	    void deleteJob(Long id);

}
