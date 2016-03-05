package com.springs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greet") //adds a relative path to the url
public class AnnotatedHelloController {
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld(){
		
		ModelAndView model=new ModelAndView("HelloPage");
		model.addObject("msg", "Hello WOrld");
		
		return model;
	}
}
