package com.example.udemycourse.model;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.*;
import lombok.*;

// LOMBOK
//@Getter
//@Setter
//@ToString

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "student")
public class Student {

	@JsonIgnore // To ignore the JSON field in response
	@Id
	@GeneratedValue
	private long id;
	
	@JsonProperty("first_name") // Change field in JSON
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column
	private String email;
	
	public Student (Student student) {
		this.id = student.getId();
	}
	
}
