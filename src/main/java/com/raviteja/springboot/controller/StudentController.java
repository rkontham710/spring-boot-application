package com.raviteja.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raviteja.springboot.entity.Student;
import com.raviteja.springboot.service.IStudentService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	private IStudentService iStudentService;
	
	@PostMapping("registerStudent")
	@ApiOperation(value = "New Student details",
				  notes = "Needs to add student details to the database",
				  response = Student.class)
	@ApiResponse(code = 200,message = "I have Created Student",response = Student.class)
	public ResponseEntity<Object> registerStudent(@RequestBody Student student) {
		iStudentService.registerStudent(student);
		return new ResponseEntity<Object>("Registered the student successfully", HttpStatus.OK);
	}
	
	@PostMapping("updateStudentDetails")
	@ApiOperation(value = "Update Student details",
	  notes = "Needs to update student details to the database",
	  response = Student.class)	
	public ResponseEntity<Object> updateStudentDetails(@RequestBody Student student) {
		iStudentService.updateStudentDetails(student);
		return new ResponseEntity<Object>("Updated the Student Details Successfully", HttpStatus.OK);
	}
	
	@GetMapping("students")
	@ApiOperation(value = "Retrieve all Student details",
	  notes = "Needs to retrieve all student details from the database",
	  response = Student.class)	
	public List<Student> getAllStudents() {
		return iStudentService.getAllStudents();
	}
	
	@GetMapping("students/{id}")
	@ApiOperation(value = "Get Student By His Id",
	  notes = "Needs to get student by Id from the database",
	  response = Student.class)	
	public Optional<Student> getStudent(@PathVariable Integer id) {
		return iStudentService.getStudent(id);
	}
	
	@DeleteMapping("students/{id}")
	public void removeStudent(@PathVariable Integer id) {
		iStudentService.removeStudent(id);
	}
}
