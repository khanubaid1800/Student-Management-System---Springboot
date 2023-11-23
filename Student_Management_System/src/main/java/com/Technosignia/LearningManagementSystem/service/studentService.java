package com.Technosignia.LearningManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.LearningManagementSystem.dao.studentRepository;
import com.Technosignia.LearningManagementSystem.entity.student;

@Service
public class studentService {
	
	@Autowired
	studentRepository studentRepository;
	public student createStudent(student student)
	{
		return studentRepository.save(student);
	}

}
