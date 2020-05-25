package com.base.spring.section_1_9_1.requiredannotation.pojo;

import org.springframework.beans.factory.annotation.Required;

public class Student {

    private String studentName;
    private String age;

    public Student() {
    }

    public Student(String studentName, String age) {
        this.studentName = studentName;
        this.age = age;
    }

    public String getStudentName() {
        return studentName;
    }

    @Required
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
