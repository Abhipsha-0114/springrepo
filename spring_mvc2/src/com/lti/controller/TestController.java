package com.lti.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller



public class TestController {
	@RequestMapping(value="/hi",method = RequestMethod.GET)
		public ModelAndView sayHello()
		{
			ModelAndView model=new ModelAndView("helloWorld");
			model.addObject("message","hubyhu9");
			return model;
		}
	
	@RequestMapping(value="/sayHello",method = RequestMethod.GET)
	public ModelAndView sayHelloToName(@RequestParam("name") String name)
	{
		ModelAndView model =new ModelAndView("sayHello");
		 model.addObject("name",name);
		 model.addObject("todaysDate",new Date());
		 return model;
	}
	@RequestMapping(value="/prime",method = RequestMethod.GET)
	public ModelAndView displayPrime(@RequestParam("number") int num)
	{
		ModelAndView model =new ModelAndView("prime");
		 model.addObject("number",num);
		 int flag=1;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				flag++;
			}
		}
		if(flag==2)
		{
			model.addObject("message", "prime");
			
		}
		else
		{
			model.addObject("message", " not prime");
		}
		 return model;
	}
	}



