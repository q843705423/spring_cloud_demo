package com.teradata.service_provide.service;

import com.teradata.service_provide.model.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class StudentService {


    public List<Student>list(){
        List<Student>list = Arrays.asList(
                new Student(1L,"Tom"),
                new Student(2L,"Bob"),
                new Student(3L,"Carry")
        );
        return list;
    }
}
