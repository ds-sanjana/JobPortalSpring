package com.spring.job.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.job.entity.Recruiter;
import com.spring.job.service.RecruiterService;

@Controller
@RequestMapping("/recruiter")
public class RecruiterController {
	@Autowired
    private RecruiterService rservice;

    @GetMapping("/register")
    public String registerPage(Model model){
        model.addAttribute("recruiter", new Recruiter());
        return "recruiter-register";
    }

    @PostMapping("/save")
    public String saveRecruiter(@ModelAttribute Recruiter recruiter){
        rservice.saveRecruiter(recruiter);
        return "redirect:/recruiter/login";
    }
    @GetMapping("/login")
    public String loginPage(){
        return "recruiter-login";
    }


}
