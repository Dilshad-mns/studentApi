package com.example.dilshad.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.dilshad.model.Student;

@Repository
public class StudentRepository {
	private List<Student> students = Arrays.asList(Student.builder().name("Dilshad").address("Rishikesh").build());
	
	public List<Student> getStudents(){
		return students;
	}
 }
