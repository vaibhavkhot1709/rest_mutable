package com.rest_mutable.dao;

import java.util.List;

import com.rest_mutable.model.Student;

public interface StudentDao {
	
	public void createStudent(Student student);

	public List<Student> getAllStudent();
	
	public Student deleteById(int id);

}
