package com.coforge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.entities.Student;
import com.coforge.repositories.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;
	
	public List<Student> findAll(){
		return studentRepository.findAll();
	}

	public Student save(Student student){
		return studentRepository.save(student);
	}

	public Student findById(Long studentId){
		return studentRepository.findById(studentId).orElseThrow();
	}
}
