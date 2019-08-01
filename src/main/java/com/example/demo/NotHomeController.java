package com.example.demo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NotHomeController {

	@RequestMapping("notHome")
	public String notHome(@RequestParam("name") String myName,HttpSession session)
	{
		session.setAttribute("name", myName);
		return "notHome";
	}
	
	@RequestMapping("mvHome")
	public ModelAndView mvHome(@RequestParam("name") String myName)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", myName);
		mv.setViewName("notHome");
		return mv;
	}
	
	
}
