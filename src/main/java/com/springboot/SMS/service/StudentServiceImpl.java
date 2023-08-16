package com.springboot.SMS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.SMS.Entity.Student;
import com.springboot.SMS.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {

		return studentRepository.save(student);

	}

	

	@Override
	public Student getStudentById(Long id) {

		return studentRepository.findById(id).get();
	}

	@Override
	public void deleteStudentById(Long id) {

		studentRepository.deleteById(id);
		
		
	}

	

}
