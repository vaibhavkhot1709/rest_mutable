package com.rest_mutable.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rest_mutable.dao.StudentDao;
import com.rest_mutable.exception.GlobalEx;
import com.rest_mutable.model.Student;


@Repository
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao dao;

	public void createStudent(Student student) {
	
		dao.createStudent(student);
	}

	@Override
	public List<Student> getAllStudent() {

		return dao.getAllStudent();
	}

	@Override
	public Student deleteById(int id) {
		return dao.deleteById(id);
	}

	@Override
	public Student updateEmployee(Student student) {
		
		return dao.updateStudent(student);
	}

	@Override
	public Student updatePatch(Student student) {
		return dao.updatePatch(student);
	}

	@Override
	public Student updatePatchById(int id) {
		return dao.updatePatchById(id);
	}

	@Override
	public Student getById(int id){
		return dao.getById(id);
	}
}
