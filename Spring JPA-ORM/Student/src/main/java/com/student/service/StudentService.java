package com.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.student.Entity.StudentEntity;
import com.student.Repository.StudentRepository;

@Component
public class StudentService {
	@Autowired
	StudentRepository repository;
	
	public StudentEntity saveStudent(StudentEntity studentEntity) {
		StudentEntity save = repository.save(studentEntity);
		return save;
	}
}
