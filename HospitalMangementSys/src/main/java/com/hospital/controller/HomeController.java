package com.hospital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

	
//	@RequestMapping("/login")
//	@Transactional
//	public ModelAndView loginForm() {
//		ModelAndView md = new ModelAndView("home");
//		
//		User user = new User("admin", "password");
//		Session session = sessionFactory.openSession();
//		session.save(user);
//		session.close();
//		return md;
//	}
//	
	
	@RequestMapping("/header")
	public ModelAndView header() {
		return new ModelAndView("header");
	}
	
	
}
