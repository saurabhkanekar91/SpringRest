package com.springrest.SpringRest.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

@Entity
@Table(name="student")
public class Student {

	@Id
	private int user_id;
	
	private long pincode;
	
	private String user_name;
	
	private String user_surname;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date dob;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date joining;
	
	@NotNull()
	private boolean is_deleted = Boolean.FALSE;

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

	public boolean isIs_deleted() {
		return is_deleted;
	}

	public void setIs_deleted(boolean is_deleted) {
		this.is_deleted = is_deleted;
	}
	
	public Student(int user_id, long pincode, String user_name, String user_surname, Date dob, Date joining,
			boolean is_deleted) {
		super();
		this.user_id = user_id;
		this.pincode = pincode;
		this.user_name = user_name;
		this.user_surname = user_surname;
		this.dob = dob;
		this.joining = joining;
		this.is_deleted = is_deleted;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [user_id=" + user_id + ", pincode=" + pincode + ", user_name=" + user_name + ", user_surname="
				+ user_surname + ", dob=" + dob + ", joining=" + joining + ", is_deleted=" + is_deleted + "]";
	}
	
}
