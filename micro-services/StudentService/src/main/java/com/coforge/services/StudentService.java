package com.coforge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.coforge.entities.Course;
import com.coforge.entities.Student;
import com.coforge.feign.CourseFeignClient;
import com.coforge.repositories.StudentRepository;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	CourseFeignClient client;
	
	public List<Student> findAll(){
		List<Student> sList = studentRepository.findAll();
		System.out.println(sList);
		for(Student s: sList) {
//			Course course = restTemplate.getForObject("http://CourseService/api/v1/course/"+s.getCid(), Course.class);
			Course course = client.getCourseByCourseId(s.getCid());
			s.setCourse(course);
		}
		return sList;
	}

	public Student save(Student student){
		return studentRepository.save(student);
	}

	@CircuitBreaker(name ="CourseService", fallbackMethod = "fallback")
	public Student findById(Long studentId){
		Student student = studentRepository.findById(studentId).orElseThrow();
		System.out.println(student);
//		Course course = restTemplate.getForObject("http://localhost:8082/api/v1/course/"+student.getCid(), Course.class);
		Course course = client.getCourseByCourseId(student.getCid());
		student.setCourse(course);
		return student;
	}
	
	public Student fallback(long sid,Exception e) {
		Student s = studentRepository.findById(sid).orElse(null);
		if(s==null)
			return new Student(0,"Student Does not exist",0,new Course(0,"Course service is down",0.0));
		s.setCourse(new Course(0,"Course Service is down",0));
		return s;
	}
}
