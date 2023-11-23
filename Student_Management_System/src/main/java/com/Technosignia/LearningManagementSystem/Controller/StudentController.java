package com.Technosignia.LearningManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.LearningManagementSystem.entity.student;
import com.Technosignia.LearningManagementSystem.service.studentService;

@RestController
public class StudentController {
	
	@Autowired
	studentService studentService;
	
	@PostMapping("/student")
	public student createStudent(@RequestBody student student)
	{
		
		return studentService.createStudent(student);
	}
	

}
