package com.spring.job.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.job.entity.Application;
import com.spring.job.service.ApplicationService;

@Controller
@RequestMapping("/application")
public class ApplicationController {
	@Autowired
	private ApplicationService aservice;
	
	@GetMapping("/apply")
    public String applyPage(Model model){
        model.addAttribute("application", new Application());
        return "apply-job";
    }

    @PostMapping("/save")
    public String saveApplication(@ModelAttribute Application application){
        aservice.saveApplication(application);
        return "redirect:/jobs";
    }
	

}
