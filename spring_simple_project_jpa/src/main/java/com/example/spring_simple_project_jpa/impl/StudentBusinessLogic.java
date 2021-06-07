package com.example.spring_simple_project_jpa.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_simple_project_jpa.entity.Student;
import com.example.spring_simple_project_jpa.exception.StudentNotFoundException;
import com.example.spring_simple_project_jpa.service.StudentService;

@Service 
public class StudentBusinessLogic {
	
	@Autowired
	private StudentService studentService;

	public  List<Student>  findAll()
	
	{
		
		List<Student> a=studentService.findAll();
		if(a.isEmpty())
		{
			throw new StudentNotFoundException("Resource Not Found");
		}
		System.out.println(a);
		return a;

}
}
