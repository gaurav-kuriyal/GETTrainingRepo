package com.coforge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ResponseBody
public class LoginController {
	
	@RequestMapping("/login")
	public ModelAndView doLogin() {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}

	@RequestMapping("/authenticate")
	public ModelAndView doAuthentication(@RequestParam("uname") String uname,@RequestParam("pwd") String pwd) {
		ModelAndView mv = new ModelAndView();
		String username=uname;
		String password=pwd;
		
		if(username.equals("gaurav")&&password.equals("gaurav@123")) {
//			mv.addObject("welcome");
//			mv = new ModelAndView("welcome");
			mv.addObject("username",username);
			mv.setViewName("welcome");
//			
		}else {
//			mv = new ModelAndView("error");
//			mv.addObject("error");
			mv.setViewName("error");
		}
		return mv;
	}

}
