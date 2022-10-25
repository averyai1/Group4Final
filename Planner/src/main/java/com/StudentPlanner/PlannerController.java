package com.StudentPlanner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlannerController {

	@RequestMapping("/home")
	public String home() 
	{
		return "home";
	}
	@RequestMapping("/calendar")
	public String calendar() 
	{
		return "calendar";
	}
	@RequestMapping("/prioritypage")
	public String prioritypage() 
	{
		return "prioritypage";
	}
	
	/*
	 * Redirects the default endpoint ("/") to the home page
	 */
	@RequestMapping("/")
	public String redirectToHome() {
		return "redirect:home";
	}
	
}
