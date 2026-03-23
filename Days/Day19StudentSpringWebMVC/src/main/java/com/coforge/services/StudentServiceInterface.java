package com.coforge.services;

import java.util.List;

import com.coforge.entities.Student;

public interface StudentServiceInterface {
	public List<Student> getAll();
	public String save(Student student);
	public Student getById(long sid);
	public String update(Student student);
	public void delete(long sid);
}
