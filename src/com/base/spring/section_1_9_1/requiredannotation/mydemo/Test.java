package com.base.spring.section_1_9_1.requiredannotation.mydemo;


import com.base.spring.section_1_9_1.requiredannotation.pojo.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext();
        System.out.println("a");
        ac.setConfigLocation("com/base/spring/section_1_9_1/requiredannotation/xmlfiles/beans.xml");
        System.out.println("b");
        ac.refresh();
        System.out.println("c");

        Student bean = (Student) ac.getBean("student");
        System.out.println(bean);
    }

}
