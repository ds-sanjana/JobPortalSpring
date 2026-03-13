package com.spring.job.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.job.entity.Job;

public interface JobRepository extends JpaRepository<Job,Long> {
	List<Job> findByLocation(String location);

    List<Job> findByjobTitleContaining(String keyword);
    
    

}
