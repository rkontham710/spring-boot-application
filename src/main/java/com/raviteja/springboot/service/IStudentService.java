package com.raviteja.springboot.service;

import java.util.List;
import java.util.Optional;

import com.raviteja.springboot.entity.Student;

public interface IStudentService {
	
	public void registerStudent(Student student);
	public void updateStudentDetails(Student student);
	public List<Student> getAllStudents();
	public Optional<Student> getStudent(Integer id);
	public void removeStudent(Integer id);
}
