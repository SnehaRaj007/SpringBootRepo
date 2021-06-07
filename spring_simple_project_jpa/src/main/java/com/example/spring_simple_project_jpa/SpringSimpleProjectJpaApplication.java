package com.example.spring_simple_project_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.example.spring_simple_project_jpa"})
public class SpringSimpleProjectJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSimpleProjectJpaApplication.class, args);
	}
	
	

}
