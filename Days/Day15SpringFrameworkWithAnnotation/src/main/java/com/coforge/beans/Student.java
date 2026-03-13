package com.coforge.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component("std")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
	@Value("${Student.sid}")
	private long sid;
	@Value("${Student.sname}")
	private String sname;
	@Autowired
	private Course course;
	
}
