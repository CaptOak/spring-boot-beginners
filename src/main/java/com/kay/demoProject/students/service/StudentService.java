package com.kay.demoProject.students.service;

import com.kay.demoProject.students.model.StudentModel;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<StudentModel> findAllStudents(){
        return List.of(
                new StudentModel(
                        "Kay",
                        "Kanu",
                        LocalDate.now(),
                        "e@mail.com",
                        40
                ),
                new StudentModel(
                        "Phine",
                        "Kanu",
                        LocalDate.now(),
                        "j@mail.com",
                        35
                ),
                new StudentModel(
                        "Oak",
                        "Kanu",
                        LocalDate.now(),
                        "o@mail.com",
                        3
                )
        );
    }
}
