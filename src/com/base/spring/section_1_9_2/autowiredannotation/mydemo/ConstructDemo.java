package com.base.spring.section_1_9_2.autowiredannotation.mydemo;

import com.base.spring.section_1_9_2.autowiredannotation.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;

public class ConstructDemo {


    private Student student;

    public ConstructDemo() {
    }

    @Autowired
    public ConstructDemo(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
