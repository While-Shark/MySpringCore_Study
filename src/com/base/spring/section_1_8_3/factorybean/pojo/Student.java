package com.base.spring.section_1_8_3.factorybean.pojo;

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
