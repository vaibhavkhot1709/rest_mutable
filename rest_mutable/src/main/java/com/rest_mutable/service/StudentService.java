package com.rest_mutable.service;

import java.util.List;

import com.rest_mutable.model.Student;

public interface StudentService {
	
	public void createStudent(Student student);

	public List<Student> getAllStudent();
	
	public Student deleteById(int id);


}
