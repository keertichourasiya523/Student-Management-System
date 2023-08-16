package com.springboot.SMS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.SMS.Entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {

	

}
