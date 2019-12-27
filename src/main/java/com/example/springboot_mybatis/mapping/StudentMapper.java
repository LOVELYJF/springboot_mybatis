package com.example.springboot_mybatis.mapping;

import com.example.springboot_mybatis.entity.Stduent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

// 指定一个操作数据库的mapper
@Mapper
public interface StudentMapper {
    @Select("select *  from student where id = #{id}")
    Stduent selectStudent(Integer id);
}
