package com.coforge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.entities.Student;
import com.coforge.services.StudentService;

@Controller
@ResponseBody
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@RequestMapping("/student")
	public ModelAndView getAll(){
		List<Student> slist = service.getAll();
		ModelAndView mv = new ModelAndView("list");
		mv.addObject("slist",slist);
		
		return mv;
		
	}
}
