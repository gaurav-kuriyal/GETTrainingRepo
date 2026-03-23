package com.coforge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.entities.Student;
import com.coforge.services.StudentService;

@Controller
@ResponseBody
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@RequestMapping("/student/list")
	public ModelAndView getAll(){
		List<Student> slist = service.getAll();
		ModelAndView mv = new ModelAndView("list");
		mv.addObject("slist",slist);
		
		return mv;
	}
	
	@RequestMapping("/student/add")
	public ModelAndView addStudent() {
		ModelAndView mv = new ModelAndView("add");		
		return mv;
	}

	@RequestMapping(value="/student/add",method = RequestMethod.POST)
	public String save(@ModelAttribute Student student) {
		String s = service.save(student);
		return s;
	}
	
	@RequestMapping("/student/view")
	public ModelAndView getById(@RequestParam("sid") long sid) {
		Student s = service.getById(sid);
		ModelAndView mv = new ModelAndView("student");
		mv.addObject("student",s);
		return mv;
	}
	
	@RequestMapping("/student/update")
	public ModelAndView updateStudentForm(@RequestParam("sid") long sid) {
		ModelAndView mv = new ModelAndView("update");
		Student s = service.getById(sid);
		mv.addObject("student",s);
		return mv;
	}
	
	@RequestMapping(value="/student/update",method = RequestMethod.POST)
	public String updateStudent(@ModelAttribute Student student) {
		service.update(student);
		return "redirect:/student/list";
	}

	@RequestMapping("/student/delete")
	public String deleteStudent(@RequestParam("sid") long sid) {
		service.delete(sid);
		return "Deleted";
	}
}
