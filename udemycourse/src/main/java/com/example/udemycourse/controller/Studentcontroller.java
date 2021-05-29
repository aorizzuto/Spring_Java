package com.example.udemycourse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.udemycourse.model.Student;
import com.example.udemycourse.model.StudentResponse;
import com.example.udemycourse.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class Studentcontroller {

	//@Value("${app.name}")
	@Value("${app.name:Default Ale app name}")
	private String appName;
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/all")
	//@GetMapping("")
	//@GetMapping("/api/student") // Without RequestMapping annotation
	//@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<StudentResponse> getAllStudent () {
		return studentService.getAllStudents();
	}
	
	@GetMapping("/{id}")
	public StudentResponse getStudent(@PathVariable Long id) {
		Student student = studentService.getStudent(id);
		return new StudentResponse(student);
	}
	
	@PostMapping
	public StudentResponse createStudent (@RequestBody StudentResponse student) {
		Student newStudent = studentService.createStudent(student);
	
		return new StudentResponse(newStudent);
	}
	
	@PutMapping
	public StudentResponse updateStudent (@RequestBody StudentResponse student) {
		Student studentUpdated = studentService.updateStudent(student);
		
		return new StudentResponse(studentUpdated);
	}
	
	@DeleteMapping
	public StudentResponse deleteStudent(@RequestParam Long id) {
		studentService.deleteStudent(id);
		
		return null;
	}
}
