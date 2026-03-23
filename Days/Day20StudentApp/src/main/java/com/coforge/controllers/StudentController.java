package com.coforge.controllers;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.Exception.InvalidDateFormatException;
import com.coforge.entities.Student;
import com.coforge.services.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@GetMapping("/")
	public ResponseEntity<List<Student>> getHome(){
		return new ResponseEntity<>(studentService.getAllStudents(),HttpStatus.OK);
	}

	@GetMapping("/students/all")
	public ResponseEntity<List<Student>> getAllStudents(){
		return new ResponseEntity<>(studentService.getAllStudents(),HttpStatus.OK);
	}

	@PostMapping("/student/add")
//	public ResponseEntity<Student> addStudent(@RequestBody Student student){
	public ResponseEntity<Student> addStudent(@RequestBody Map<String, Object> payload){
		System.out.println("Enterred here");
		String sname=(String) payload.get("sname");
		String course=(String) payload.get("course");
		String address=(String) payload.get("address");
		
		LocalDate dob = null;
		try {			
			dob= LocalDate.parse((String) payload.get("dob")) ;
		} 
		catch (DateTimeParseException e) {
			e.printStackTrace();
			throw new InvalidDateFormatException("Invalid Date! Date format should YYYY-mm-DD and you provided "+(String) payload.get("dob"));
		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
		Student student = new Student(sname,course,address,dob);
		
		return new ResponseEntity<>(studentService.saveStudent(student),HttpStatus.OK);
	}

	@GetMapping("/student/{sid}")
	public ResponseEntity<Student> getStudent(@PathVariable("sid") long sid){
		return new ResponseEntity<>(studentService.getStudent(sid),HttpStatus.OK);
	}

	@PutMapping("/student/{sid}")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student,@PathVariable("sid") long sid){
		return new ResponseEntity<>(studentService.updateStudent(student,sid),HttpStatus.OK);
	}
	
	@DeleteMapping("/student/{sid}")
	public ResponseEntity<String> deleteStudent(@PathVariable("sid") long sid){
		studentService.deleteStudent(sid);
		return new ResponseEntity<>("Deleted",HttpStatus.OK);
	}
}
