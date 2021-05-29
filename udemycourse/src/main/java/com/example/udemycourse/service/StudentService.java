package com.example.udemycourse.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.udemycourse.model.StudentTable;
import com.example.udemycourse.model.StudentResponse;
import com.example.udemycourse.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	
	public List<StudentResponse> getAllStudents () {
		List<StudentTable> studentList = studentRepository.findAll();
		
		List<StudentResponse> studentResponseList = new ArrayList<StudentResponse>();
	
		studentList.stream().forEach(student -> {
			studentResponseList.add(new StudentResponse(student));
		});
		
		return studentResponseList;
	}
	
	public StudentTable createStudent (StudentResponse studentResponse) {
		StudentTable student = new StudentTable(studentResponse);
		
		student = studentRepository.save(student);
		return student;
	}
	
	
}
