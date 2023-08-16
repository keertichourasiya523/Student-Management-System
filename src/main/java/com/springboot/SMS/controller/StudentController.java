package com.springboot.SMS.controller;
import com.springboot.SMS.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.SMS.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students")
	public String listStudents(Model m) {
		m.addAttribute("students",studentService.getAllStudents());
		return "students";
		
		
	}
	@GetMapping("/students/new")
	public String createStudentForm(Model m) {
		Student student=new Student();
		m.addAttribute("student",student);
		return "create_student";
		
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		
		studentService.saveStudent(student);
		return"redirect:/students";
		
	}
	
	@GetMapping("/student/edit/{id}")
	public String editStudent(@PathVariable Long id, Model m) {
 m.addAttribute("student",studentService.getStudentById(id));
  return"edit_student";
		
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,@ModelAttribute("student")Student student, Model m) {
		Student s1=studentService.getStudentById(id);
		s1.setId(student.getId());
		s1.setfName(student.getfName());
		s1.setlName(student.getlName());
		s1.setEmail(student.getEmail());
		studentService.updateStudent(s1);
		return "redirect:/students";
	}
	
	@GetMapping("/student/delete/{id}")
	public String deleteStudent(@PathVariable Long id) {
		
		studentService.deleteStudentById(id);
		return"redirect:/students";
		
	}
	









}

















