package com.example.udemycourse.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class StudentResponse {

	private long id;
	
	private String firstName;
	private String lastName;
	private String email;
	
	public StudentResponse (StudentTable student) {
		this.id = student.getId();
		this.firstName = student.getFirstName();
		this.lastName = student.getLastName();
		this.email = student.getEmail();
	}
}
