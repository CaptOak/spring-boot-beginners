package com.kay.demoProject.students.controller;

import com.kay.demoProject.students.model.StudentModel;
import com.kay.demoProject.students.service.StudentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(@Qualifier("DBStudentService") StudentService studentService) {
        this.studentService = studentService;
    }


    @PostMapping
    public StudentModel save(@RequestBody StudentModel student){
        return studentService.save(student);
    }

    @GetMapping("/{email}")
    public StudentModel findByEmail(@PathVariable("email") String email){
        return studentService.findByEmail(email);
    }

    @GetMapping
    public List<StudentModel> findAllStudents(){
        return studentService.findAllStudents();
    }

    @PutMapping
    public StudentModel updateStudent(@RequestBody StudentModel student){
        return studentService.updateStudent(student);
    }


    @DeleteMapping("/{email}")
    public void delete(@PathVariable("email") String email){
        studentService.delete(email);
    }
}
