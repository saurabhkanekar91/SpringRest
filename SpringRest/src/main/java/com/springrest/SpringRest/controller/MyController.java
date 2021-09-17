package com.springrest.SpringRest.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.SpringRest.entity.Student;
import com.springrest.SpringRest.services.StudentService;

@RestController
public class MyController {
	
	@Autowired
	public StudentService studentService;
	
	// For Testing 
	@GetMapping("/home")
	public String home()
	{
		return "This is home";
	}

	// For Showing
	@GetMapping("/Students")
	public List<Student> getLStudents(){
		return this.studentService.getStudent();
	}
	
	// For Sorting By DOB
	@GetMapping("/Students/{dob}")
	public List<Student> getAllSorting(@PathVariable Date dob){
		return this.studentService.getSorting(dob);
	}
	
	// For Sorting By Joining Date
		@GetMapping("/Students/{joining}")
		public List<Student> getAll2Sorting(@PathVariable Date joining){
			return this.studentService.getSorting2(joining);
		}
	
	// For Editing
	@GetMapping("/Students/{userId}")
	public Student getSingleStudent(@PathVariable String userId){
		return this.studentService.getUser(Integer.parseInt(userId));
	}
	
	// For Saving
	@PostMapping("/Students")
	public Student addStudent(@RequestBody Student student) {
		return this.studentService.addUser(student);
	}
	
	// For Updating 
	@PutMapping("/Students")
	public Student updateStudent(@RequestBody Student student) {
		return this.studentService.updateUser(student);
	}
	
	// For Deleting 
	@DeleteMapping("/Students/{userId}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable String userId, @RequestParam(value = "softDelete",required = false) boolean isSoftDelete)
	{
		try {
			if(isSoftDelete)
			{	
				this.studentService.deleteUser(Integer.parseInt(userId));
			}
			else {
				this.studentService.userSoftDelete(userId);
			}
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	// Finding By Name
	@GetMapping("/Student/{name}")
	public List<Student> getInfoByName(@PathVariable String name){
		return this.studentService.getUserName(name);
	}
}
