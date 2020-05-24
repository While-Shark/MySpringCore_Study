package com.base.spring.section_1_9_3.primary.mypri;

import com.base.spring.section_1_9_3.primary.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;

public class PrimaryTest {

    @Autowired
    private Student student;

    public void sayMySelf(){
        System.out.println(this.student.toString());
    }

}
