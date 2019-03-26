package com.teradata.service_provide.controller;

import com.teradata.service_provide.model.Student;
import com.teradata.service_provide.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("student")
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("list")
    public List<Student> getAll(){
        return studentService.list();
    }

}
