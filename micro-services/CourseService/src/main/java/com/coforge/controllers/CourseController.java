package com.coforge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.entities.Course;
import com.coforge.services.CourseService;

@RestController
@RequestMapping("/api/v1")
public class CourseController {
	@Autowired
	CourseService courseService;
	
	@GetMapping("/course")
	public List<Course> findAll(){
		return courseService.findAll();
	}
	
	@PostMapping("/course")
	public Course save(@RequestBody Course course){
		return courseService.save(course);
	}
	
	@GetMapping("/course/{courseId}")
	public Course findById(@PathVariable("courseId") Long courseId){
		return courseService.findById(courseId);
	}
}
