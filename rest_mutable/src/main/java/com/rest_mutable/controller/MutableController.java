package com.rest_mutable.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rest_mutable.exception.GlobalEx;
import com.rest_mutable.model.Student;
import com.rest_mutable.service.StudentService;

@Controller
public class MutableController {

	@Autowired
	StudentService service;
	
//	@GetMapping ("/hello")
//	public @ResponseBody String hello(){
//		return "hello";
//	}
	
	
	@GetMapping("/students")
	public @ResponseBody List<Student>  getAllStudent() {
		return service.getAllStudent();
	}
	
	
	@PostMapping("/students")
	public @ResponseBody String  createStudent(@RequestBody Student student) {
		service.createStudent(student);
		
		return "succssefull";
	}

	
	@DeleteMapping("/students/{id}")
	public @ResponseBody Student deleteById(@PathVariable("id") int id) throws GlobalEx{
		
		// this used for get By Id Student
//		Student student=service.deleteById(id);
//		
//		if(null != student)
//			return service.deleteById(id);
//		else
//			throw new GlobalEx("not present");
//	
		return service.deleteById(id);
	}
	
	
	@PutMapping("/students")
	public @ResponseBody Student updateEmployee(@RequestBody Student student) {
		return service.updateEmployee(student);
	}
	
//
//	@PatchMapping("/students")
//	public @ResponseBody Student updatePatch(@RequestBody Student student) {
//		return service.updatePatch(student);
//	}
	
	
	
	@PatchMapping("/students/{id}")
	public @ResponseBody Student updatePatchById(@RequestBody int id) {
		
		return service.updatePatchById(id);
	}

	@GetMapping("/students/{id}")
	public @ResponseBody Student getById(@PathVariable("id") int id) throws GlobalEx {
		
		Student student=service.getById(id);
		if(null !=student)
		return student;
		else 
			throw new GlobalEx("student with id : "+ id+ "  is not present");
	}

}
