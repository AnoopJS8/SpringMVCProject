package com.springs.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greet") //adds a relative path to the url
public class AnnotatedHelloController {
	
	@RequestMapping("/welcome/{countryName}/{userName}")  //using curly braces helps in mapping the url pattern at the runtime.
	//public ModelAndView helloWorld(@PathVariable("userName") String name,@PathVariable("countryName") String country){//Front controller binds the userName through PathVariable to the 'name' variable.Hence we can use the name variable to sent back request to the client.
	public ModelAndView helloWorld(@PathVariable Map<String,String> pathVars){//Not using multiple PathVariable declarations	
		String name=pathVars.get("userName");
		String country=pathVars.get("countryName");
		
		ModelAndView model=new ModelAndView("HelloPage");
		model.addObject("msg", "Hello "+name +" You are From "+country);
		
		return model;
	}
}
