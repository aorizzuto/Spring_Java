package com.example.udemycourse.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.udemycourse.model.Student;
import com.example.udemycourse.model.StudentResponse;
import com.example.udemycourse.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	
	public List<StudentResponse> getAllStudents () {
		List<Student> studentList = studentRepository.findAll();
		
		List<StudentResponse> studentResponseList = new ArrayList<StudentResponse>();
	
		studentList.stream().forEach(student -> {
			studentResponseList.add(new StudentResponse(student));
		});
		
		return studentResponseList;
	}
	
	public Student createStudent (StudentResponse studentResponse) {
		Student student = new Student(studentResponse);
		
		student = studentRepository.save(student);
		return student;
	}

	public Student updateStudent(StudentResponse student) {
		
		Student studentToUpdate = studentRepository.findById(student.getId()).get();
		
		if (student.getFirstName() != null && !student.getFirstName().isEmpty()) {
			studentToUpdate.setFirstName(student.getFirstName());
			studentToUpdate.setLastName(student.getLastName());
			studentToUpdate.setEmail(student.getEmail());
		}
		
		studentToUpdate =  studentRepository.save(studentToUpdate);
		
		return studentToUpdate;
	}

	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);		
	}

	public Student getStudent(Long id) {
		Student student = studentRepository.findById(id).get();
		return student;
	}

	public List<StudentResponse> getByFirstName(String name) {
		List<StudentResponse> studentResponseList = new ArrayList<StudentResponse>();
		List<Student> studentList = studentRepository.findByFirstName(name);
	
		studentList.stream().forEach(student -> {
			studentResponseList.add(new StudentResponse(student));
		});
		
		return studentResponseList;
	}

	public Student getByFirstLast(String firstname, String lastname) {
		Student student = studentRepository.findByFirstNameAndLastName(firstname,lastname);

		return student;
	}

	public List<Student> getAllStudentsWithPagination(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo-1, pageSize);
		
		return studentRepository.findAll(pageable).getContent();
	}
	
	
}
