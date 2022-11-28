package com.StudentPlanner.entitiy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="list")
public class Planner {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id; 
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="date")
	private int date; 
	
	@Column(name="priority")
	private String priority;
	
	
	public Planner() {
		
	}
	
	public Planner(int id, String name, String description, int date, String priority) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.date = date;
		this.priority = priority;
	}
	
	// set the getters and setters
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getDate() {
		return date;
	}
	
	public void setDate(int date) {
		this.date = date;
	}
	
	public String getPriority() {
		return priority;
	}
	
	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	@Override
	public String toString() {
		return "Planner [id=" + id + ", name=" + name + ", description=" + description + ", date=" + date 
				+ ", priority=" + priority + ", getId()=" + getId() + ", getName()" + getName() + ", getDescription()=" + getDescription() 
				+ ", getDate()=" + getDate() + ", getPriority()=" + getPriority() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";	
				
				
	}

}
