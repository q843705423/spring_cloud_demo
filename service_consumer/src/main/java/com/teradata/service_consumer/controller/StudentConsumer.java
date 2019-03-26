package com.teradata.service_consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
@RequestMapping("consumer/student")
public class StudentConsumer {
    private static final String REST_URL_PREFIX = "http://localhost:8080";
    @Autowired
    RestTemplate template ;
    @PostMapping("list")
    public List list(){
        System.out.println("hello list");
        return template.postForObject(REST_URL_PREFIX+"/student/list",null, List.class);
    }

}
