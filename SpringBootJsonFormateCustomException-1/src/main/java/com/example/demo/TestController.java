package com.example.demo;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController implements ErrorController{
	public static final String PATH="error";
	
	@Override
	@RequestMapping(value=PATH,method=RequestMethod.GET)
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return "Resource is Not Found";
	}	
	
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String wishMethod() {
		return "Welcome To SpringBoot Custom Application";
	}
}
