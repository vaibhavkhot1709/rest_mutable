package com.rest_mutable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rest_mutable.model.Student;
import com.rest_mutable.service.StudentService;

@Controller
public class MutableController {

	@Autowired
	StudentService service;
	
	@GetMapping ("/hello")
	public @ResponseBody String hello(){
		return "hello";
	}
	
	
	@PostMapping("/createStudent")
	public @ResponseBody String  createStudent(@RequestBody Student student) {
		service.createStudent(student);
		
		return "succssefull";
	}
}
