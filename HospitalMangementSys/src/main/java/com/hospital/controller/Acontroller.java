package com.hospital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hospital.model.Patient;

@Controller
public class Acontroller {

	@RequestMapping(method = RequestMethod.GET)
	public static ModelAndView first() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index");
		return mv;
		
	}
	@RequestMapping("home")
	public static ModelAndView first(Patient p) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index");
		return mv;
		
	}
}
