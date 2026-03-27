package com.coforge.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.coforge.entities.Course;

@FeignClient(name="CourseService",fallback = CourseFallback.class)
public interface CourseFeignClient {
	
	@GetMapping("/api/v1/course/{cid}")
	Course getCourseByCourseId(@PathVariable("cid") long cid);
}
