package com.StudentPlanner.service;

import java.util.List;

import com.StudentPlanner.entitiy.Planner;

public interface PlannerService {
	
	public List<Planner> findAll();
	
	public Planner findById(int theId);
	
	public void save (Planner thePlanner);
	
	public void deletebyId(int theId);

}
