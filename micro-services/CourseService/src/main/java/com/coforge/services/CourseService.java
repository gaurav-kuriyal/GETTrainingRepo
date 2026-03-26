package com.coforge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.entities.Course;
import com.coforge.repositories.CourseRepository;

@Service
public class CourseService {
	@Autowired
	CourseRepository courseRepository;
	
	public List<Course> findAll(){
		return courseRepository.findAll();
	}

	public Course save(Course course){
		return courseRepository.save(course);
	}

	public Course findById(Long courseId){
		return courseRepository.findById(courseId).orElseThrow();
	}
}
