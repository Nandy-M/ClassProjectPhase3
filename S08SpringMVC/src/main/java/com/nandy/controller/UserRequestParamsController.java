package com.nandy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserRequestParamsController {

	@RequestMapping(value = "/showdata")
	public ModelAndView showdata(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam(value="salary", required = false, defaultValue = "1000") int salary) {

		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);

		ModelAndView mv = new ModelAndView();
		mv.addObject("id", id);
		mv.addObject("name", name);
		mv.addObject("salary", salary);
		mv.setViewName("hello");

		return mv;

	}

}

//http://localhost:8080/S08SpringMVC/showdata?id=222&name=nandhu