package com.coforge.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coforge.Exception.StudentNotFoundException;
import com.coforge.entities.Student;
import com.coforge.repositories.StudentRepository;

@Repository
public class StudentDao implements StudentDaoInterface {
	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudent(long sid) {
		return studentRepository.findById(sid).orElseThrow(()->new StudentNotFoundException("Student not found for id:"+sid));
	}

	@Override
	public void deleteStudent(long sid) {
		studentRepository.deleteById(sid);
	}

}
