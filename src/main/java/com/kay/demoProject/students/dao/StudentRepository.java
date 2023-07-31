package com.kay.demoProject.students.dao;

import com.kay.demoProject.students.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentModel, Integer> {

    StudentModel findByEmail(String email);

    void deleteByEmail(String email);
}
