package com.rest_mutable.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rest_mutable.model.Student;


@Repository
public class StudentDaoImpl implements StudentDao{

	@Autowired
	SessionFactory factory;

	Session session;
	Transaction transaction;

	public void createStudent(Student student) {
		session = factory.openSession();
		transaction = session.beginTransaction();

		session.save(student);
		transaction.commit();
	}
}
