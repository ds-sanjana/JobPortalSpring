package com.spring.job.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.job.entity.Application;
import com.spring.job.repo.ApplicationRepository;

@Service
public class ApplicationServiceImpl implements ApplicationService{
	@Autowired
	private ApplicationRepository arepo;

	@Override
	public void saveApplication(Application application) {
		// TODO Auto-generated method stub
		arepo.save(application);
		
	}

	@Override
	public List<Application> getAllApplications() {
		// TODO Auto-generated method stub
		return arepo.findAll();
	}

}
