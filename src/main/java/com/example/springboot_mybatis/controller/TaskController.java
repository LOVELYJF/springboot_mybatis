package com.example.springboot_mybatis.controller;

import com.example.springboot_mybatis.entity.Task;
import com.example.springboot_mybatis.mapping.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    TaskMapper taskMapper;

    @GetMapping("/task/{id}")
    public Task getTask(@PathVariable("id") Integer id){

        return taskMapper.getTask(id);
    }

}
