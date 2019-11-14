package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.User;
import com.lti.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService service;
	@RequestMapping(value="/login",method = RequestMethod.POST)

	public ModelAndView login(@RequestParam String username,@RequestParam String password)
	{
		User incomingUser=new User();
		incomingUser.setEmail(username);
		incomingUser.setPassword(password);
		
		User u=service.login(incomingUser);
		ModelAndView model=null;
		if(u==null)
		{
			model=new ModelAndView("loginFailed");
		}
		else
		{
			model=new ModelAndView("logginIn");
			model.addObject("user",u);
		}
		return model;
				
	}
}
