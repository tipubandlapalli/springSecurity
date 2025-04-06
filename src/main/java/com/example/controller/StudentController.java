package com.example.controller;

import com.example.model.StudentEntity;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    List<StudentEntity> students = new ArrayList<>(List.of(
            new StudentEntity(1,"aram",100),
            new StudentEntity(2,"tipu",99)

    ));
    @GetMapping("/students")
    public List<StudentEntity> getStudent(){
        return students;
    }
    @GetMapping("students/csrf-token")
    public CsrfToken getCsrftoken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
    @PostMapping("/students")
    public StudentEntity addStudent(@RequestBody StudentEntity student){
         students.add(student);
         return students.getLast();
    }
}
