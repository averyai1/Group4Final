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

	@GetMapping("/home")
	public String home() 
	{
		return "home";
	}
	@GetMapping("/calendar")
	public String calendar() 
	{
		return "calendar";
	}
	@GetMapping("/prioritypage")
	public String prioritypage() 
	{
		return "prioritypage";
	}
	
}
