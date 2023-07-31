package com.kay.demoProject.students.service;

import com.kay.demoProject.students.dao.StudentRepository;
import com.kay.demoProject.students.model.StudentModel;
import com.kay.demoProject.students.service.StudentService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service("db")
@Service
public class DBStudentService implements StudentService {

    private final StudentRepository studentRepository;

    public DBStudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentModel save(StudentModel s) {
        return studentRepository.save(s);
    }

    @Override
    public List<StudentModel> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public StudentModel findByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    @Override
    public StudentModel updateStudent(StudentModel s) {
        return studentRepository.save(s);
    }

    @Override
    public void delete(String email) {
        studentRepository.deleteByEmail(email);
    }
}
