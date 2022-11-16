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
	public String priorityPage() 
	{
		return "prioritypage";
	}
	
}
