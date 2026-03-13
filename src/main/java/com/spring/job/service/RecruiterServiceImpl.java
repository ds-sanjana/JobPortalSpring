package com.spring.job.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.job.entity.Recruiter;
import com.spring.job.repo.RecruiterRepository;

@Service
public class RecruiterServiceImpl implements RecruiterService{
	 @Autowired
	    private RecruiterRepository rrepo; // to keep it safe from other classes , means they can access this repo and make it null 

	@Override
	public void saveRecruiter(Recruiter recruiter) {
		// TODO Auto-generated method stub
		rrepo.save(recruiter);
		
	}

	@Override
	public List<Recruiter> getAllRecruiters() {
		// TODO Auto-generated method stub
		return rrepo.findAll();
	}

	@Override
	public Recruiter getRecruiterById(Long id) {
		// TODO Auto-generated method stub
		return rrepo.findById(id).orElse(null);
	}

}
