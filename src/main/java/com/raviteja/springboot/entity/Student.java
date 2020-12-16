package com.raviteja.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@Entity
@Table(name="StudentsTable")
@ApiModel(description="Student Details")
public class Student {
	
	@Id
	@GeneratedValue
	@ApiModelProperty(notes="Unique Id of the Student")
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
