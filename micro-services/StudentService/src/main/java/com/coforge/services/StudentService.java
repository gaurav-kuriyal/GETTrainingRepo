package com.coforge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.coforge.entities.Course;
import com.coforge.entities.Student;
import com.coforge.repositories.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	public List<Student> findAll(){
		List<Student> sList = studentRepository.findAll();
		System.out.println(sList);
		for(Student s: sList) {
			Course course = restTemplate.getForObject("http://localhost:8082/api/v1/course/"+s.getCid(), Course.class);
			s.setCourse(course);
		}
		return sList;
	}

	public Student save(Student student){
		return studentRepository.save(student);
	}

	public Student findById(Long studentId){
		Student student = studentRepository.findById(studentId).orElseThrow();
		System.out.println(student);
		Course course = restTemplate.getForObject("http://localhost:8082/api/v1/course/"+student.getCid(), Course.class);
		student.setCourse(course);
		return student;
	}
}
