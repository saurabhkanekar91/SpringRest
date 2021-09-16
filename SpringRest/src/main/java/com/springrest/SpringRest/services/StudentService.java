package com.springrest.SpringRest.services;

import java.util.List;

import com.springrest.SpringRest.entity.Student;

public interface StudentService {
	
	public List<Student> getStudent();
	
	public Student getUser(int userid);

	public void deleteUser(int userdel);
	
	public Student addUser(Student student);
	
	public Student updateUser(Student student);

}
