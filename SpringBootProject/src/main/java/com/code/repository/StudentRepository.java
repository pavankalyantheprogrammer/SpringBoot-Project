package com.code.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
}
