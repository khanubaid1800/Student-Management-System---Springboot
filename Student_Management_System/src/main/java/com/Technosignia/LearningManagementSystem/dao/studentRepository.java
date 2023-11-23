package com.Technosignia.LearningManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Technosignia.LearningManagementSystem.entity.student;

@Repository
public interface studentRepository extends JpaRepository<student, Long>{

}
