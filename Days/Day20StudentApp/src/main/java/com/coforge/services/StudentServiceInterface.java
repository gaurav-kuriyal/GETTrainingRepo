package com.coforge.services;

import java.util.List;

import com.coforge.entities.Student;

public interface StudentServiceInterface {
	public List<Student> getAllStudents();
	public Student saveStudent(Student student);
	public Student updateStudent(Student student, long sid);
	public Student getStudent(long sid);
	public void deleteStudent(long sid);
}
