package com.example.springboot_mybatis.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Task {

    private Integer id;

    private String taskName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date   planStartDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date   planEndDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTaskName() {



        return taskName;
    }

    public void setTaskName(String taskName) {
        if(taskName==null){
            taskName="wjf";
        }
        this.taskName = taskName;
    }

    public Date getPlanStartDate() {
        return planStartDate;
    }

    public void setPlanStartDate(Date planStartDate) {
        this.planStartDate = planStartDate;
    }

    public Date getPlanEndDate() {
        return planEndDate;
    }

    public void setPlanEndDate(Date planEndDate) {
        this.planEndDate = planEndDate;
    }
}
