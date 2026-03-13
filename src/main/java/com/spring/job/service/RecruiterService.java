package com.spring.job.service;

import java.util.List;

import com.spring.job.entity.Recruiter;

public interface RecruiterService {
	void saveRecruiter(Recruiter recruiter);

    List<Recruiter> getAllRecruiters();

    Recruiter getRecruiterById(Long id);

}
