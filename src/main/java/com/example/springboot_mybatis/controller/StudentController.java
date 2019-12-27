package com.example.springboot_mybatis.controller;

import com.example.springboot_mybatis.entity.Stduent;
import com.example.springboot_mybatis.mapping.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentMapper studentMapper;

    @GetMapping("/sd/{id}")
    public Stduent getSD(@PathVariable("id") Integer id){

        System.out.println(studentMapper.selectStudent(id));

        return  studentMapper.selectStudent(id);

    }


}
