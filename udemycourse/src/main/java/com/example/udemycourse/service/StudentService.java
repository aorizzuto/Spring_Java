package com.example.udemycourse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.udemycourse.model.Student;
import com.example.udemycourse.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public List<Student> getAllStudents () {
		return studentRepository.findAll();
	}
	
	
}
