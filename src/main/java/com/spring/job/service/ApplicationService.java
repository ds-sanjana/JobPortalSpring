package com.spring.job.service;

import java.util.List;

import com.spring.job.entity.Application;

public interface ApplicationService {
	void saveApplication(Application application);

    List<Application> getAllApplications();

}
