package com.raviteja.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raviteja.springboot.entity.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Integer> {
	
}
