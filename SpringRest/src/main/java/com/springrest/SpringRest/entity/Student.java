package com.springrest.SpringRest.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int user_id;
	
	private long pincode;
	
	private String user_name;
	
	private String user_surname;
	
	private Date dob;
	
	private Date joining;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_surname() {
		return user_surname;
	}

	public void setUser_surname(String user_surname) {
		this.user_surname = user_surname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getJoining() {
		return joining;
	}

	public void setJoining(Date joining) {
		this.joining = joining;
	}

	public Student(int user_id, long pincode, String user_name, String user_surname, Date dob, Date joining) {
		super();
		this.user_id = user_id;
		this.pincode = pincode;
		this.user_name = user_name;
		this.user_surname = user_surname;
		this.dob = dob;
		this.joining = joining;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [user_id=" + user_id + ", pincode=" + pincode + ", user_name=" + user_name + ", user_surname="
				+ user_surname + ", dob=" + dob + ", joining=" + joining + "]";
	}
}
