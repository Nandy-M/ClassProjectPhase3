package com.nandy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nandy.domain.User;

@Controller
public class UserController {
	
	
	@RequestMapping("/register")  //post not supported so we change it in jsp file
	public String showRegistrationPage() {
		return "userreg";
	}

//	@RequestMapping("/register")   // post supported
//	public ModelAndView showRegistrationPage() {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("userreg");
//		return mv;
//	}
	
	@RequestMapping(value="/registeruser", method=RequestMethod.GET)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
		System.out.println("User object retrieved from UI = " + user);
		model.addAttribute("userfromcontroller", user);
		return "userregresult";	
	}
	
//	@RequestMapping(value="/registeruser", method=RequestMethod.POST)
//	public ModelAndView registerUser(@ModelAttribute("user") User user) {
//		System.out.println("User object retrieved from UI = " + user);
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("userfromcontroller", user);
//		mv.setViewName("userregresult");
//		return mv;
//	}
//	
}