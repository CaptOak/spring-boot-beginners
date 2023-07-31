package com.kay.demoProject.students.dao;

import com.kay.demoProject.students.model.StudentModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudentDao {

    private final List<StudentModel> STUDENTS = new ArrayList<>();

    public StudentModel save(StudentModel s) {
        STUDENTS.add(s);
        return s;
    }

    public List<StudentModel> findAllStudents(){
        return STUDENTS;
    }

    public StudentModel findByEmail(String email) {
        return STUDENTS.stream().filter(s -> email.equals(s.getEmail())).findFirst().orElse(null);
    }

    public StudentModel updateStudent(StudentModel s)  {
        var studentIndex = IntStream.range(0, STUDENTS.size())
                .filter(index -> STUDENTS.get(index).getEmail().equals(s.getEmail()))
                .findFirst().orElse(-1);
        if(studentIndex > -1){
            STUDENTS.set(studentIndex, s);
            return s;
        }
        return null;
    }

    public void delete(String email) {
        var student = findByEmail(email);
        if(student != null){
            STUDENTS.remove(student);
        }
    }
}