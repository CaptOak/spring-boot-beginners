package com.kay.demoProject.students.service;

import com.kay.demoProject.students.model.StudentModel;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

public interface StudentService {

    StudentModel save(StudentModel s);
    List<StudentModel> findAllStudents();

    StudentModel findByEmail(String email);

    StudentModel updateStudent(StudentModel s);

    void delete(String email);
}
