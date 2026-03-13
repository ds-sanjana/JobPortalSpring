package com.spring.job.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.job.entity.User;
import com.spring.job.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService uservice; 
	
	@GetMapping("/register")
    public String registerPage(Model model){
        model.addAttribute("user", new User());
        return "user-register";
    }

    @PostMapping("/save")
    public String saveUser(@ModelAttribute User user){
        uservice.saveUser(user);
        return "redirect:/user/login";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "user-login";
    }
    
    @PostMapping("/login")
    public String loginUser(String email, String password, Model model){

        User user = uservice.findByEmail(email);

        if(user != null && user.getPassword().equals(password)){
            return "user-dashboard";
        }else{
            model.addAttribute("error","Invalid Email or Password");
            return "user-login";
        }
    }

}
