package com.spring.job.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.job.entity.Job;
import com.spring.job.service.JobService;

@Controller
@RequestMapping("/jobs") 
public class JobController {
	@Autowired
	private JobService jservice;
	
	@GetMapping
    public String viewJobs(Model model){
        model.addAttribute("jobs", jservice.getAllJobs());
        return "job-list";
    }

    @GetMapping("/post")
    public String postJobPage(Model model){
        model.addAttribute("job", new Job());
        return "post-job";
    }

    @PostMapping("/save")
    public String saveJob(@ModelAttribute Job job){
        jservice.saveJob(job);
        return "redirect:/jobs";
    }

    @GetMapping("/delete/{id}")
    public String deleteJob(@PathVariable Long id){
        jservice.deleteJob(id);
        return "redirect:/jobs";
    }
	
	

}
