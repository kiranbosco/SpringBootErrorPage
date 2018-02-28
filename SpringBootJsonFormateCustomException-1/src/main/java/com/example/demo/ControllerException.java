package com.example.demo;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerException  {
	

	@ExceptionHandler(value=RuntimeException.class)
public String exceptionHandler() {
		return "resource";
	}


	}


//
