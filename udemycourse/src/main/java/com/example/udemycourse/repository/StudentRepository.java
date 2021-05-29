package com.example.udemycourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.udemycourse.model.StudentTable;

@Repository
public interface StudentRepository extends JpaRepository<StudentTable, Long>{

}
