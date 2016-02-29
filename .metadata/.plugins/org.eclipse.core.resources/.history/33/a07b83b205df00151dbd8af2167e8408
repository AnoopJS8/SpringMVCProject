package com.springs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
 
public class HelloController extends AbstractController{
 
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
 
		ModelAndView modelandview = new ModelAndView("HelloPage");//The parameter here is the web page name to be requested by the view resolver present in WEB-INF
		modelandview.addObject("welcomeMessageTagPresentInJSPPage", "Hi User, welcome to the Spring MVC Application");
		
		return modelandview;
	}
}
