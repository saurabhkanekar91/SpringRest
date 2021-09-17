package com.springrest.SpringRest.services;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.springrest.SpringRest.dao.StudentDao;
import com.springrest.SpringRest.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Override
	public List<Student> getStudent() {
		
		return studentDao.findAll();
	}

	@Override
	public Student getUser(int userid) {
		// TODO Auto-generated method stub
		return studentDao.getById(userid);
	}

	@Override
	public void deleteUser(int userdel) {
		
		Student s = studentDao.getById(userdel);
		 studentDao.delete(s);
	}

	@Override
	public Student addUser(Student student) {
		// TODO Auto-generated method stub
		return studentDao.save(student);
	}

	@Override
	public Student updateUser(Student student) {
		// TODO Auto-generated method stub
		return studentDao.save(student);
	}

	@Override
	public List<Student> getSorting(Date dob) {
		List<Student> passengers = studentDao.findAll(Sort.by(Sort.Direction.ASC, "dob"));
		return passengers;
	}

	@Override
	public List<Student> getSorting2(Date joining) {
		List<Student> passenger = studentDao.findAll(Sort.by(Sort.Direction.ASC, "joining"));
		return passenger;
	}

	@Override
	public List<Student> getUserName(String user_name) {
		// TODO Auto-generated method stub
		return studentDao.getByUserName(user_name);
	}

	@Override
	public void userSoftDelete(String user_id) {
		// TODO Auto-generated method stub
		studentDao.softDelete(user_id);
	}
	
}
