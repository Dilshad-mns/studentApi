package com.example.dilshad.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
	private List<String> students = Arrays.asList("Dilshad", "Shabaz", "Afzal");
	
	public List<String> getStudents(){
		return students;
	}
 }
