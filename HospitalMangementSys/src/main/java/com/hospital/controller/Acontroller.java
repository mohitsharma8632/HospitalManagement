package com.hospital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Acontroller {

	@RequestMapping(method = RequestMethod.GET)
	public static ModelAndView first() {
		ModelAndView mv=new ModelAndView();
		System.out.println("was here");
		mv.setViewName("index");
		return mv;
		
	}
}
