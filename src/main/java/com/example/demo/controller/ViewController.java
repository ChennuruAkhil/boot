package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.repository.Employee;
import com.example.demo.repository.EmployeeRepo;

@Controller
public class ViewController {

	@Autowired
	EmployeeRepo repo;
	
	@RequestMapping("/")
	public String first() {
		return "Home";
	}
	
	//@RequestMapping("/signup")
	@PostMapping("/signup")
	public String signup(Employee e) {
		System.out.println("Inside signup");
	    repo.save(e);	
		return "SignupSuccess";
	}
	
	@PostMapping("/login")
	public ModelAndView login(Employee e) {
		String uname=e.getUsername();
		String pwd=e.getPassword().trim();
		Employee e1=repo.findByUsername(uname);
		System.out.println(pwd);
		System.out.println(e1.getPassword());
		ModelAndView mv = new ModelAndView();
		if(pwd.equals(e1.getPassword().trim())) {
			mv.setViewName("DashBoard");
			mv.addObject("name", e1.getNickname());
			return mv;
		}
		mv.setViewName("LoginFail");
		return mv;
	}
	
}
