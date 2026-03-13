package com.spring.job.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.job.entity.Job;
import com.spring.job.repo.JobRepository;

@Service
public class JobServiceImpl implements JobService {
	@Autowired
	private JobRepository jrepo;

	@Override
	public void saveJob(Job job) {
		// TODO Auto-generated method stub
		jrepo.save(job);
	}

	@Override
	public List<Job> getAllJobs() {
		// TODO Auto-generated method stub
		return jrepo.findAll();
	}

	@Override
	public Job getJobById(Long id) {
		// TODO Auto-generated method stub
		return jrepo.findById(id).orElse(null);
	}

	@Override
	public void deleteJob(Long id) {
		// TODO Auto-generated method stub
		jrepo.deleteById(id);
		
	}

}
