package com.rest_mutable.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rest_mutable.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

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

	@Override
	public List<Student> getAllStudent() {
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		List<Student> stdList = session.createQuery("from Student").list();
//		session.save(stdList);
		txn.commit();
		
		return stdList;
	}
	
	
	public Student deleteById(int id) {
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		Student student= session.get(Student.class, id);
		Student s2=session.get(Student.class, id);
		session.delete(student);
		txn.commit();
	
		return s2;
	}
	
}
