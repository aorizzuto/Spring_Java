package com.example.udemycourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.udemycourse.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
