package com.coforge.dao;

import java.util.List;
import java.util.Optional;

import com.coforge.entities.Student;

public interface StudentDaoInterface {
	public List<Student> getAllStudents();
	public Student saveStudent(Student student);
	public Student updateStudent(Student student);
	public Student getStudent(long sid);
	public void deleteStudent(long sid);
}
