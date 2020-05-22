package com.base.spring.section_1_9_4.primarywithqualifier.mypq;


import com.base.spring.section_1_9_3.primary.mypri.PrimaryTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext();
        System.out.println("a");
        ac.setConfigLocation("com/base/spring/section_1_9_4/primarywithqualifier/xmlfiles/beans.xml");
        System.out.println("b");
        ac.refresh();
        System.out.println("c");
        PrimaryWithQufTest pwq = (PrimaryWithQufTest) ac.getBean("pwq");
        pwq.printStudentInfo();
    }

}
