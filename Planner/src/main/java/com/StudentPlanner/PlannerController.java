package com.StudentPlanner;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.StudentPlanner.entitiy.Planner;
import com.StudentPlanner.service.PlannerService;




@Controller
@RequestMapping("/Planner")
public class PlannerController {
	
	public PlannerService plannerService;
	
	public PlannerController (PlannerService thePlannerService) {
		plannerService = thePlannerService;
	}

	@GetMapping("/home")
	public String home(Model theModel) 
	{
		
		List<Planner> thePlanners = plannerService.findAll();
		
		//add faculties to the Spring Model
		theModel.addAttribute("planner", thePlanners);
		
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
