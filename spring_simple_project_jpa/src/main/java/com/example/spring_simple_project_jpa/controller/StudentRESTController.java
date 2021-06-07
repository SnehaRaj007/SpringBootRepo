package com.example.spring_simple_project_jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_simple_project_jpa.entity.Student;
import com.example.spring_simple_project_jpa.impl.StudentBusinessLogic;


@RestController

public class StudentRESTController {
	
	@Autowired
	private StudentBusinessLogic  studentBusinessLogic;
	
	@RequestMapping(value =  "/students",method = RequestMethod.GET)
	public ResponseEntity<List<Student>> findAll()
	{
		return new ResponseEntity<List<Student>>(studentBusinessLogic.findAll(), HttpStatus.OK);
	}
	

}
