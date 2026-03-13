package com.spring.job.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.job.entity.Application;
import com.spring.job.entity.Job;
import com.spring.job.entity.User;

public interface ApplicationRepository extends JpaRepository<Application, Long>{
	List<Application> findByUser(User user);

    List<Application> findByJob(Job job);

}
 