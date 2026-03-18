package com.coforge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.dao.StudentDao;
import com.coforge.entities.Student;

@Service
public class StudentService implements StudentServiceInterface{

	@Autowired
	private StudentDao dao;
	
	@Override
	public List<Student> getAll() {
		return dao.getAll();
	}

	@Override
	public String save(Student student) {
		return dao.save(student);
	}

	@Override
	public Student getById(long sid) {
		return dao.getById(sid);
	}

}
