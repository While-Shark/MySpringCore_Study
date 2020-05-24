package com.base.spring.section_1_9_4.customqualifierannotations;

import com.base.spring.section_1_9_4.customqualifierannotations.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;

public class SimpleDemo {

    @Autowired
    @Genre("betterStudent")
    private Student betterStudent;
    private Student goodStudent;

    public Student getBetterStudent() {
        return betterStudent;
    }

    public void setBetterStudent(Student betterStudent) {
        this.betterStudent = betterStudent;
    }

    public Student getGoodStudent() {
        return goodStudent;
    }

    @Autowired
    public void setGoodStudent(@Genre("goodStudent")Student goodStudent) {
        this.goodStudent = goodStudent;
    }
}
