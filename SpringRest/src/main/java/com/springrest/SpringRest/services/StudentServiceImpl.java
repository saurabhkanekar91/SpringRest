package com.springrest.SpringRest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

}
