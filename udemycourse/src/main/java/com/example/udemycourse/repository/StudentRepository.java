package com.example.udemycourse.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.udemycourse.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	List<Student> findByFirstName(String name);
	
	Student findByFirstNameAndLastName(String firstname, String lastname);
	
	List<Student> findByFirstNameOrLastName(String firstname, String lastname);
	
	List<Student> findByFirstNameIn (List<String> firstnames);
	
	List<Student> findByEmailContains (String word);
	
	List<Student> findByFirstNameStartsWith (String word);
	
	@Query("From Student where firstName = :firstname and lastName = :lastname")
	List<Student> getStudentsWithFirstNameAndLastName(@Param("firstname") String first, String lastname);
}
