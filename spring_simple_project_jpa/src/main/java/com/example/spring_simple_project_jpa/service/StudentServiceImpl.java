package com.example.spring_simple_project_jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_simple_project_jpa.dao.StudentRepository;
import com.example.spring_simple_project_jpa.entity.Student;
import com.example.spring_simple_project_jpa.exception.StudentNotFoundException;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> findAll() {
		
		 List<Student> a=studentRepository.findAll();
		 if(a.isEmpty())
		 {
			 throw new StudentNotFoundException("Resource Not Found");
		 }
		 
		 return a;
	}
	
	
	
}
