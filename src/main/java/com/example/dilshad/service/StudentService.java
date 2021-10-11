package com.example.dilshad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dilshad.model.Student;
import com.example.dilshad.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	

	public List<Student> getStudents() {
		return studentRepository.getStudents();
	}
}
