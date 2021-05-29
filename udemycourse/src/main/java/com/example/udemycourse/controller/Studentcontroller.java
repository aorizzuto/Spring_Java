package com.example.udemycourse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.udemycourse.model.Student;
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
	public List<Student> getAllStudent () {
		return studentService.getAllStudents();
	}
}
