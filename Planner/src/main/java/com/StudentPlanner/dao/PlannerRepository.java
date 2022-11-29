package com.StudentPlanner.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentPlanner.entitiy.Planner;

public interface PlannerRepository extends JpaRepository<Planner, Integer> {
	
	public List<Planner>findAllByOrderByPriorityDesc();

}
