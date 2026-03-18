package com.coforge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ResponseBody
@RequestMapping("/hellocontroller")
public class HelloController {
	
	@RequestMapping("/hello")
	public ModelAndView sayHello() {
		ModelAndView mv = new ModelAndView("hello");
		mv.addObject("uname","Gaurav");
		return mv;
	}
}
