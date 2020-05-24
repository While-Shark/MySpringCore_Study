package com.base.spring.section_1_9_4.primarywithqualifier.mypq;

import com.base.spring.section_1_9_4.primarywithqualifier.pojo.Person;
import com.base.spring.section_1_9_4.primarywithqualifier.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

public class PrimaryWithQufTest {

    private Student student;

    private Person person;

    @Autowired
    public void load(@Qualifier("betterStudent") Student stu, @Nullable Person per){
        this.student = stu;
        this.person = per;
    }

    public void printStudentInfo(){
        System.out.println(this.student.toString());
    }

}
