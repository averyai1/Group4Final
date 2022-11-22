package com.StudentPlanner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.StudentPlanner.service.PlannerService;



@Controller
@RequestMapping("/Planner")
public class PlannerController {
	
	public PlannerService plannerService;
	
	public PlannerController (PlannerService thePlannerService) {
		plannerService = thePlannerService;
	}

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
	
}
