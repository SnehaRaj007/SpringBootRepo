package com.example.spring_simple_project_jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring_simple_project_jpa.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
