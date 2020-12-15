package com.raviteja.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="StudentsTable")
public class Student {
	
	@Id
	@GeneratedValue
	private int studentId;
	private String studentName;
	private String studentDetails;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentDetails() {
		return studentDetails;
	}
	public void setStudentDetails(String studentDetails) {
		this.studentDetails = studentDetails;
	}
	

		
}
