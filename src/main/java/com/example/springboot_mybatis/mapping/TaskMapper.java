package com.example.springboot_mybatis.mapping;

import com.example.springboot_mybatis.entity.Task;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TaskMapper {

    Task getTask(Integer id);


}
