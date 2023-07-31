package com.kay.demoProject.students.service;

import com.kay.demoProject.students.dao.InMemoryStudentDao;
import com.kay.demoProject.students.model.StudentModel;
import org.springframework.stereotype.Service;

import java.util.List;


//@Service("im")
@Service
public class InMemoryStudentService implements StudentService{

    private final InMemoryStudentDao dao;

    public InMemoryStudentService(InMemoryStudentDao dao) {
        this.dao = dao;
    }

    @Override
    public StudentModel save(StudentModel s) {
        return this.dao.save(s);
    }

    @Override
    public List<StudentModel> findAllStudents(){
        return this.dao.findAllStudents();
    }

    @Override
    public StudentModel findByEmail(String email) {
        return this.dao.findByEmail(email);
    }

    @Override
    public StudentModel updateStudent(StudentModel s) {
        return this.dao.updateStudent(s);
    }

    @Override
    public void delete(String email) {
        this.dao.delete(email);
    }
}
