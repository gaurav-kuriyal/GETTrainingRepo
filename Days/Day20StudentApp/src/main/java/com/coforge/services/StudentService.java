package com.coforge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.Exception.StudentNotFoundException;
import com.coforge.dao.StudentDao;
import com.coforge.entities.Student;

@Service
public class StudentService implements StudentServiceInterface {
	@Autowired
	StudentDao studentDao;
	
	@Override
	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}

	@Override
	public Student updateStudent(Student student, long sid) {
		Student exStudent = studentDao.getStudent(sid);
		exStudent.setSname(student.getSname());
		exStudent.setCourse(student.getCourse());
		exStudent.setAddress(student.getAddress());
		return studentDao.updateStudent(exStudent);
	}

	@Override
	public Student getStudent(long sid) {
		return studentDao.getStudent(sid);
	}

	@Override
	public void deleteStudent(long sid) {
		studentDao.getStudent(sid);
		studentDao.deleteStudent(sid);
	}

}
