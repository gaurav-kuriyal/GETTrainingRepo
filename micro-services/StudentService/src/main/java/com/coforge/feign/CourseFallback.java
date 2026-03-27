package com.coforge.feign;

import org.springframework.stereotype.Component;

import com.coforge.entities.Course;

@Component
public class CourseFallback implements CourseFeignClient {

	@Override
	public Course getCourseByCourseId(long cid) {
		Course course=new Course();
		course.setCid(cid);
		course.setCname("Course Service Unavailable");
		course.setPrice(0);
		return course;
	}
	
}
