# TO DO

Design Document

Isabella Peters, Grant Kollar, Avery Ingram

## Introduction

The TO DO web application is a task manager that will allow users to create an organized view of their different to do lists and task lists.   

Users will be able to make multiple lists of tasks to do and organize tasks in different categories and labels.  You can also prioritize different tasks, make favorites, and personalize your task list to be organized in a way that makes sense to you.  

This application will also have a web page with a Calander that is constantly updated alongside the user data. All events will be put onto the Calander automatically and will change as the user changes description, time, etc. of the event. 

Our goal is to make a very streamlined and user-friendly planning application that makes it easy to organize and view tasks within the month. 


## Storyboard
<img width="482" alt="Screen Shot 2022-10-24 at 12 18 58 AM" src="https://user-images.githubusercontent.com/75335175/197447883-7dcb7290-7dba-48b7-9384-1fa0b701895c.png">

<img width="482" alt="Screen Shot 2022-10-24 at 12 19 05 AM" src="https://user-images.githubusercontent.com/75335175/197447893-3d30e10b-cd89-4d63-a8ed-1a1062fe1c37.png">

<img width="484" alt="Screen Shot 2022-10-24 at 12 19 11 AM" src="https://user-images.githubusercontent.com/75335175/197447914-9a61a0e8-b4a3-4026-b2ff-d3160d582996.png">


## Functional Requirements

### 1. As a person, I want to be able to create multiple to do lists so that I can have lists for different topics.  

**Given**: User logs in to TO DO.  

**When**: User clicks on the button to add a to do list.  

**Then**: User will be able to add tasks to said to do list.  

**Given**: User logs in to TO DO.  

**When**: User attempts to create a task.  

**Then**: User will not be able to add a task without creating a list first.  

### 2. As a person, I want to be able to categorize my to do lists so that I can personalize and organize my multiple lists.  

**Given**: The user is logged in and has selected one of their to do lists.  

**When**: The user categorizes their list into a topic.  

**Then**: The list will be saved to that category.  

**Given**: The user is logged in and has selected one of their to do lists. 

**When**: The user does not categorize their list into a specific topic.  

**Then**: The list will continue to be saved without a category.  

### 3. As a person, I want to be able to prioritize different tasks and make favorites so that I can have accountability and remember my tasks. 

**Given**: The user is logged in and has a list of tasks.  

**When**: The user prioritizes tasks in order of importance.  

**Then**: The user has an organized list of tasks.  

**Given**: The user is logged in and has a list of tasks.  

**When**: The user favorites a task.  

**Then**: That task is favorited for importance.  

**Given**: The user is logged in and has a list of tasks.  

**When**: The user does not prioritize or favorite tasks.  

**Then**: The list is left without favorites or priorities.  


## Class Diagram

<img width="633" alt="Screen Shot 2022-10-24 at 12 19 20 AM" src="https://user-images.githubusercontent.com/75335175/197448235-21488bf5-a0ba-4e68-a854-e90d2d991bf6.png">


### Class Diagram Description

ToDoScreen – The first screen the user sees.  This will have the main dashboard of lists and tasks.  

AddAList – Screen that allows the user to add a list.  

TaskList – Screen that shows a task list.  

AddATask – Screen that allows the user to add a task.  

IListDAO – Interface to find lists.  

ListDAO – Database for lists.  

ITaskDAO – Interface to find tasks.  

TaskDAO – Database for tasks.  

Task – A noun class that represents tasks.  

Category – A noun class that represents different organizational categories.  


## Scrum Roles

Avery Ingram – Product Owner, Developer 

Isabella Peters – Scrum master, Developer 

Grant Kollar – UI Specialist, Developer  


