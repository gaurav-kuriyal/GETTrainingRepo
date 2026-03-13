package com.coforge.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component("course")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Course {
	@Value("${Course.courseId}")
	private String courseId;
	@Value("${Course.courseName}")
	private String courseName;
	@Value("${Course.courseCost}")
	private double courseCost;
}
