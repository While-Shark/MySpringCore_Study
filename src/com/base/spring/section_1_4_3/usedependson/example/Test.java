package com.base.spring.section_1_4_3.usedependson.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext();
        System.out.println("a");
        ac.setConfigLocation("com/base/spring/section_1_4_3/usedependson/xmlfiles/beans.xml");
        System.out.println("b");
        ac.refresh();
        System.out.println("c");
        ExampleBean bean = (ExampleBean) ac.getBean("one");
        System.out.println(bean.toString());

    }

}
