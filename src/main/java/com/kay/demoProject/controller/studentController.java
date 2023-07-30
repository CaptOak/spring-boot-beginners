package com.kay.demoProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class studentController {
    @GetMapping
    public List<String> findAllStudents(){
        return List.of(
                "Kay",
                "Hello World"
        );
    }
}