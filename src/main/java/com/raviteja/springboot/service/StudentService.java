package com.raviteja.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raviteja.springboot.entity.Student;
import com.raviteja.springboot.repository.IStudentRepository;

@Service
public class StudentService implements IStudentService {

	@Autowired
	private IStudentRepository iStudentRepository;
	
	@Override
	public void registerStudent(Student student) {
		iStudentRepository.save(student);
	}

	@Override
	public void updateStudentDetails(Student student) {
		iStudentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return iStudentRepository.findAll();
	}

	@Override
	public Optional<Student> getStudent(Integer id) {
		return iStudentRepository.findById(id);
	}

	@Override
	public void removeStudent(Integer id) {
		iStudentRepository.deleteById(id);
	}
	
	
	

}
