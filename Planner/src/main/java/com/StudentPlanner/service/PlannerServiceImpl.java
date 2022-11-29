package com.StudentPlanner.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentPlanner.dao.PlannerRepository;
import com.StudentPlanner.entitiy.Planner;
@Service
public class PlannerServiceImpl implements PlannerService{

	private PlannerRepository plannerRepository;
	
	@Autowired
	public PlannerServiceImpl (PlannerRepository thePlannerRepository) {
		plannerRepository = thePlannerRepository;
		
	}
	public List<Planner> findAll() {
		return plannerRepository.findAllByOrderByPriority();
	}
	
	public Planner findById(int theId) {
		Optional<Planner> plannerid = plannerRepository.findById(theId);
		
		Planner thePlanner = null;
		
		if (plannerid.isPresent()) {
			thePlanner = plannerid.get();
		}
		else 
		{
			throw new RuntimeException("The PlannerId you've entered is invalid - " + theId);
		}
		return thePlanner;
	}
	
	public void save(Planner thePlanner) {
		plannerRepository.save(thePlanner);
	}
	
	public void deletebyId(int theId) {
		plannerRepository.deleteById(theId);
	}
	
}
