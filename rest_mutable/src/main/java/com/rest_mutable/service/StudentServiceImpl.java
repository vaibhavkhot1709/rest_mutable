package com.rest_mutable.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rest_mutable.dao.StudentDao;
import com.rest_mutable.model.Student;


@Repository
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao dao;

	public void createStudent(Student student) {
	
		dao.createStudent(student);
	}
}
