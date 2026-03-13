package com.spring.job.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.job.entity.Recruiter;

public interface RecruiterRepository extends JpaRepository<Recruiter, Long>{
	Recruiter findByEmail(String email);
	

}
