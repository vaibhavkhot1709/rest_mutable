package com.rest_mutable.dao;

import java.util.List;

import com.rest_mutable.exception.GlobalEx;
import com.rest_mutable.model.Student;

public interface StudentDao {
	
	public void createStudent(Student student);

	public List<Student> getAllStudent();
	
	public Student deleteById(int id);
	
	public Student updateStudent(Student student);

	public Student updatePatch(Student student);
	
	public Student updatePatchById(int id);

	public Student getById(int id);


}
