package com.springboot.SMS.service;

import java.util.List;

import com.springboot.SMS.Entity.Student;

public interface StudentService {

	 List<Student> getAllStudents();
	 
	 public Student saveStudent(Student student);

     public Student updateStudent(Student student);
     
     public Student getStudentById(Long id);
     
     public void deleteStudentById(Long id);

}
