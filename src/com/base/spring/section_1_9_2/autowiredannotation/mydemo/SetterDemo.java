package com.base.spring.section_1_9_2.autowiredannotation.mydemo;

import com.base.spring.section_1_9_2.autowiredannotation.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class SetterDemo {


    private Student student;

    public SetterDemo() {
    }

    public SetterDemo(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    @Autowired
    public void setStudent(Student student) {
        this.student = student;
    }
}
