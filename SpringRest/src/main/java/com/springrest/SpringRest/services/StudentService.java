package com.springrest.SpringRest.services;

import java.sql.Date;
import java.util.List;

import com.springrest.SpringRest.entity.Student;

public interface StudentService {
	
	public List<Student> getStudent();
	
	public Student getUser(int userid);

	public void deleteUser(int userdel);
	
	public Student addUser(Student student);
	
	public Student updateUser(Student student);
	
	public List<Student> getSorting(Date dob);
	
	public List<Student> getSorting2(Date joining);
	
	public List<Student> getUserName(String user_name);

	public void userSoftDelete (String user_id);
}
